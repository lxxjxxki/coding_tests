import sys
# 0 1 1 2 3 5

T = int(sys.stdin.readline())

def fibonacci(N):
    zero = [1, 0]
    one = [0, 1]
    if N >= 2:
        for i in range(1, N):
            zero.append(zero[i-1] + zero[i])
            one.append(one[i-1] + one[i])
    print("{0} {1}".format(zero[N], one[N]))


for _ in range(T):
    N = int(input())
    fibonacci(N)