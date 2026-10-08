while True:
    print("¿Que quieres hacer?")
    print("1. Sumar")
    print("2. Restar")
    print("3. Multiplicar")
    print("4. Dividir")
    print("5. Salir")

    valor = input("")

    match valor:
        case "1":
            num1 = float(input("Dame el primer numero: "))
            num2 = float(input("Dame el segundo numero: "))

            val = num1 + num2

        case "2":

            num1 = float(input("Dame el primer numero: "))
            num2 = float(input("Dame el segundo numero: "))

            val = num1 - num2


        case "3":
            num1 = float(input("Dame el primer numero: "))
            num2 = float(input("Dame el segundo numero: "))

            val = num1 * num2

        case "4":
            num1 = float(input("Dame el primer numero: "))
            num2 = float(input("Dame el segundo numero: "))

            try:
                val = num1 / num2

            except ZeroDivisionError:
                print("No se puede dividir por cero")

        case "5":
            break

        case _:
            print("Coge uno de esos opciones")





