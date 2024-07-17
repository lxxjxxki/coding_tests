def backtracking():
    if(len(s) == m):
        if(is_sorted(s)):
            print(' '.join(map(str, s)))
        return
    for i in range(1, n+1):
        if visited[i]:
            continue
        visited[i] = True
        s.append(i)
        backtracking()
        s.pop()
        visited[i] = False

def is_sorted(s):
    if(sorted(s) == s):
        return True
    return False

n, m = map(int, input().split())
s = []
visited = [False]*(n+1)

backtracking()
