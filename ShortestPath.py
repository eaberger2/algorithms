from collections import deque

def ShortestPath(graph, start, end):
    S = set()
    node_dists = {}
    node_dists[0] = 0
    parent = [0]*len(graph)
    parent[0] = -1
    q = deque()
    q.append((-1,start))
    while q:
        edge = q.popleft()
        if edge[0] != -1:
            new_dist = node_dists[edge[0]] + graph[edge[0]][edge[1]]
            if edge[1] in node_dists.keys():
                if new_dist < node_dists[edge[1]]:
                    node_dists[edge[1]] = new_dist
                    parent[edge[1]] = edge[0]
            else:
                node_dists[edge[1]] = new_dist
                parent[edge[1]] = edge[0]
        visited = edge[1]
        if visited not in S:
            for node in range(len(graph[visited])):
                if graph[visited][node] != 0:
                    q.append((visited,node))
            S.add(visited)
    path = [end]
    i = end
    while parent[i] != -1:
        path.append(parent[i])
        i = parent[i]
    path.reverse()
    return path

def main():
    graph = [[0,4,2,0,0,0,0,0,0],
             [0,0,0,3,4,0,0,0,0],
             [0,6,0,0,0,0,0,0,0],
             [0,0,0,0,0,5,0,0,0],
             [0,0,0,0,0,0,5,2,0],
             [0,0,0,0,0,0,0,1,0],
             [0,0,0,0,0,0,0,8,5],
             [0,0,0,0,0,0,0,0,1],
             [0,0,0,0,0,0,0,0,0]]
    print(ShortestPath(graph,0,8))
    graph = [[0,3,4,6,2,0],
             [2,0,3,3,0,0],
             [0,1,0,5,6,2],
             [0,0,0,0,2,8],
             [0,3,0,6,0,3],
             [0,0,0,0,4,0]]
    print(ShortestPath(graph,0,5))

if __name__ == "__main__":
    main()