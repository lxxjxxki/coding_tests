import math

def factorial(num):
    if num == 1:
        return 1
    return num * factorial(num - 1)


T = int(input())

for _ in range(T):
    m = int(input())
    result = 0
    for i in range(1, m+1):
        result += math.log10(i)
    print(int(result+1))
