n = int(input())
import sys
li = [int(x) for x in sys.stdin.readline().strip().split(' ')]

dp = [-2000] * n
dp[0] = li[0]
for i in range(1, n):
    dp[i] = max(li[i], li[i] + dp[i-1])
    
print(max(dp))
