import sys

N = int(sys.stdin.readline())

people = []

for _ in range(N):
    x, y = list(map(int, sys.stdin.readline().split()))
    people.append((x, y))

for i in range(N):
    rank = 1
    for j in range(N):
        if i != j:
            if (people[i][0] < people[j][0]) and (people[i][1] < people[j][1]):
                rank += 1
    print(rank, end=" ")
