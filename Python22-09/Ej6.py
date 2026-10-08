lista = []

while True:
    print("1. Añadir un producto a la lista")
    print("2. Ver todos los productos")
    print("3. Eliminar un producto de la lista")
    print("4. Salir")

    valor = input("")

    match valor:
        case "1":
            prod = input("Introduce producto: ")
            lista.append(prod)

        case "2":
            listado = ""
            for i in lista:
                listado += i + " "
            print(listado)
            input("Dale enter para seguir: ")


        case "3":
            eliminprod = input("Introduce producto: ")
            for i in lista:
                if i == eliminprod:
                    lista.remove(i)
                else:
                    print("No existe en la lista")
                    pass

        case "4":
            break

        case _:
            print("Opcion incorrecta")





