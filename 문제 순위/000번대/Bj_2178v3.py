import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split(" "))

graph = []

for _ in range(N) :
    graph.append(list(map(int, sys.stdin.readline().strip())))
   

print(graph)

def BFS(x, y) :
    print("dfs 함수 만들기")
    # 왼 오 위 아래
    mx = [-1, 1, 0, 0]
    my = [0, 0, 1, -1]

    queue = deque()
    queue.append((x, y))

    while queue :
        x, y = queue.popleft()
        for i in range(4) :
            nx = x + mx[i]
            ny = y + my[i]

            # 위치 벗어나면 안되므로 조건 추가
            if nx<0 or nx>=N or ny<0 or ny>=M:
                continue
            # 벽이므로 진행 불가
            if graph[nx][ny]==0:
                continue
            # 벽이 아니므로 이동 가능
            if graph[nx][ny]==1:
                graph[nx][ny] = graph[x][y]+1
                queue.append((nx,ny))


    return graph[N-1][M-1]

print(BFS(0,0))
    
