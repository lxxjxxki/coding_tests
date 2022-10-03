N, K = map(int, input().split())


A = []
for _ in range(N):
    A.append(int(input()))

A.sort(reverse=True)

coin = 0
for i in range(N):
    coin += K // A[i]
    K = K % A[i]

print(coin)
