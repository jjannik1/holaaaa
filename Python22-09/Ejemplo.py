import random
from functools import reduce


def media(mis_notas):
    def suma_acu (x,y):
        return x + y
    total = reduce (suma_acu, mis_notas)
    return total / len(mis_notas)

notas = [random.uniform(0.0, 10.0) for x in range(10)]

print(media(notas))