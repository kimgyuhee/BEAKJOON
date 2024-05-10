import sys
from collections import deque

N, M = map(int, sys.stdin.readline().split(" "))

matrix = [list(map(int, input().split())) for _ in range(N)]

queue = deque()

for i in range(N) :
    for j in range(M) :
        if matrix[i][j] == 1 :
            queue.append((i, j))


def BFS() :
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]

    while queue :
        x, y = queue.popleft()
        
        for i in range(4) :
            nx = x + dx[i]
            ny = y + dy[i]

            # 위치 벗어나면 안되므로 조건 추가
            if nx<0 or nx>=N or ny<0 or ny>=M:
                continue
            # 벽이므로 진행 불가
            if matrix[nx][ny]==-1:
                continue
            if matrix[nx][ny] == 0 :
                matrix[nx][ny] = matrix[x][y]+1
                queue.append((nx, ny))

BFS()
print(matrix)
