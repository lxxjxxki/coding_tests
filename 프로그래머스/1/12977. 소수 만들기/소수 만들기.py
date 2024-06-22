import math
def solution(nums):
    answer = 0

    for i in range(0, len(nums) - 2, 1):
        for j in range(i+1, len(nums) - 1, 1):
            for k in range(j+1, len(nums), 1):
                N = nums[i] + nums[j] + nums[k]
                if (isPrime(N) is True): answer += 1

    return answer


def isPrime(N):
    if N < 2:
        return False
    prime = [True] * (N+1)
    prime[0], prime[1] = False, False

    p = 2
    while p * p <= N:
        if prime[p]:
            for multiple in range(p*p, N+1, p):
                prime[multiple] = False
        p += 1
    return prime[N]