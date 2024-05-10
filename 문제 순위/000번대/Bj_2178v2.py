import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split(" "))

graph = []

for _ in range(N) :
    graph.append(list(map(int, sys.stdin.readline().strip())))
    

def BFS(x, y) :
    queue = deque()
    queue.append((x, y))

    mx = [-1, 1, 0, 0]
    my = [0, 0, -1, 1]

    while queue :
        x, y = queue.popleft()
        print(x, y)
        for i in range(4):
            nx = x + mx[i]
            ny = y + my[i]

            # if nx < 0 or nx >= N or ny < 0 or ny >= M :
            if nx<0 or nx>=N or ny<0 or ny>=M:
                continue
            if graph[nx][ny] == 0 :
                continue
            if graph[nx][ny] == 1 :
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))

    return graph[N-1][M-1]


print(BFS(0,0))