from collections import deque

M, N = map(int, input().split())

matrix = [list(map(int, input().split())) for _ in range(N)]

queue = deque([])

for i in range(N) :
    for j in range(M) :
        if matrix[i][j] == 1 :
            queue.append([i, j])

dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

res = 0 

def BFS() :
    while queue:
        x, y = queue.popleft()

        for i in range(4) :
            nx = x + dx[i]
            ny = y + dy[i]

            if 0<= nx <N and 0<= ny <M and matrix[nx][ny] == 0 :
                matrix[nx][ny] = matrix[x][y] +1
                queue.append([nx, ny])


BFS()

print(matrix)
for i in matrix :
    for j in i :
        if j == 0 :
            print(-1)
            exit()
        if res < j :
            res = j

print(res-1)