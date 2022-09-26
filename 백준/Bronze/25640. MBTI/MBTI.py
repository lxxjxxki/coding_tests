import sys

jinho = str(sys.stdin.readline())
T = int(sys.stdin.readline())
result = 0
for _ in range(T):
    friend = str(sys.stdin.readline())
    if jinho == friend :
        result += 1

print(result)