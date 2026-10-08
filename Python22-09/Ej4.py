valor = int(input("Dame un numero para dibujar su tabla de multiplicar: "))

for i in range(11):
    fin = valor * i
    print(f'{valor} x {i} = {fin}')