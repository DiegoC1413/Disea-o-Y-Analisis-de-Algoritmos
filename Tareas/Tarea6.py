def cubeta():
    datos = [70, 12, 78, 40, 33, 4, 31, 57, 10, 41, 22, 89, 88, 97, 13]
    slots = 10
    cubetas = []
    for i in range(0, 10, 1):
        cubetas.append([])
    print(cubetas)
    for index in range(len(datos)):
        num = datos[index] // slots
        cubetas[num].append(datos[index])
    print(cubetas)

    for recorrido in range(len(cubetas)):
        x = (cubetas[recorrido])
        longitud = len(x)
        for i in range(longitud - 1):
            menor = i
            for j in range(i + 1, longitud):
                if x[j] < x[menor]:
                    menor = j
                    temp = x[menor]
                    x[menor] = x[i]
                    x[i] = temp
        print(x)
cubeta()