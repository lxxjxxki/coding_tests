import sys

n = int(input())
li = [(list(map(int, sys.stdin.readline().strip().split(' ')))) for _ in range(n)]

dp = [[0]*3 for _ in range(n)]
dp[0] = li[0]

for i in range(1, n):
    dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + li[i][0]
    dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + li[i][1]
    dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + li[i][2]

print(min(dp[n-1]))
