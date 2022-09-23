import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int [] arreglo = { 9,1,2,4,8,6,5,7,3};

        seleccion(arreglo);

        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }   

    private static void seleccion (int[] arreglo){
        for (int i= 0; i < arreglo.length; i++){
            int minimo = i;
            for(int j = i + 1; j < arreglo.length; j++ ){
                if(arreglo[j] <arreglo [minimo] ){
                    minimo = j;

                }
            }
            if (i != minimo){
                int axuliar = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = axuliar ;    
            }
        }
    } 
}
