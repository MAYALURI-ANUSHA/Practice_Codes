import heapq

# Function to find the minimum cost of the graph
def find_min_cost(graph, highlighted, disjoint_set):
    min_cost = 0
    heap = []

    for vertex in range(1, len(graph)):
        if not highlighted[vertex]:
            for neighbor, weight in graph[vertex]:
                if not highlighted[neighbor] and disjoint_set[vertex] == disjoint_set[neighbor]:
                    heapq.heappush(heap, weight)

    while heap:
        min_cost += heapq.heappop(heap)

    return min_cost if min_cost > 0 else -1

# Function to union two sets in the disjoint-set data structure
def union(sets, u, v):
    sets[u] = v

# Function to find the representative of a set in the disjoint-set data structure
def find(sets, u):
    if sets[u] != u:
        sets[u] = find(sets, sets[u])
    return sets[u]

# Read input
n, m, q = map(int, input().split())
graph = [[] for _ in range(n + 1)]
highlighted = [False] * (n + 1)
disjoint_set = list(range(n + 1))
costs = []

for _ in range(m):
    u, v, c = map(int, input().split())
    graph[u].append((v, c))
    graph[v].append((u, c))

# Process queries
for _ in range(q):
    query = input().split()
    v = int(query[1])

    if query[0] == '+':
        highlighted[v] = True
        for neighbor, _ in graph[v]:
            if highlighted[neighbor]:
                union(disjoint_set, v, neighbor)
    else:
        highlighted[v] = False

    min_cost = find_min_cost(graph, highlighted, disjoint_set)
    costs.append(min_cost)

# Output costs
for cost in costs:
    print(cost)