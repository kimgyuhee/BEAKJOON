# from collections import deque
# import sys


# N, M, V = map(int, sys.stdin.readline().split(" "))

# print(N+M+V)
# points = {i+1 : deque() for i in range(N)}
# visited = [False for i in range(N)]

# n_visited = [1 for i in range(N)]
# dfs = ""
# bfs = ""

# B = []
# dict = {1 : "fd", 2 : [2, 31, 4]}
# dict[2].append(3)
# print(dict[2])
# graph = []

# for _ in range(M) :
#     x, y = map(int, sys.stdin.readline().split(" "))
#     points[x].append(y)
#     points[y].append(x)


# print(points)
# def DFS(v) :
#     queue = deque()
#     queue.append(v)

#     print(v)
#     visited[v-1] = True
#     # print(visited)
#     while points[v]:
#         point = points[v].popleft()
#         # print("point : ",point)
#         if not visited[point-1] :
#             DFS(point)
#     return




# def BFS(v) :
#     B.append(v)
#     visited[v-1] = True
#     while points[v]:
#         point = points[v].popleft()
#         if not visited[point-1] :
#             B.append(point)
#             visited[point-1] = True

#     return 0


from collections import deque
import sys


N, M, V = map(int, sys.stdin.readline().split(" "))

# bfs_points = {i+1 : deque() for i in range(N)}
# dfs_points = {i+1 : deque() for i in range(N)}
points = {i+1 : deque() for i in range(N)}
bfs_visited = [1 for i in range(N)]
dfs_visited = [1 for i in range(N)]

for _ in range(M) :
    x, y = map(int, sys.stdin.readline().split(" "))
    points[x].append(y)
    points[y].append(x)

def BFS2(v):
    bfs = ""
    queue = deque()
    queue.append(v)

    # while sum(bfs_visited)!= 0 :
    while queue:
        point = queue.popleft()
        if bfs_visited[point-1] == 1 :
            bfs = bfs+str(point)+" "
            queue+=sorted(points[point])
            bfs_visited[point-1] = 0
        else :
            continue
        # print(">>>", bfs)
    return bfs

def DFS2(v) :
    dfs = ""
    queue = deque()
    queue.append(v)

    # while sum(dfs_visited)!= 0 :
    while queue:
        point = queue.popleft()
        if dfs_visited[point-1] == 1 :
            dfs = dfs+str(point)+" "
            for s in reversed(sorted(points[point])) :
                queue.appendleft(s)
            dfs_visited[point-1] = 0

        else :
            continue
        # print(">>>", dfs)
    return dfs

print("="*20)
print(DFS2(V))
print(BFS2(V))