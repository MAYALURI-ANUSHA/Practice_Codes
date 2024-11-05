def generate_tree(n, edges):
    tree = [[] for _ in range(n+1)]
    for a, b in edges:
        tree[a].append(b)
        tree[b].append(a)
    return tree

def generate_most_different_tree(n, edges):
    tree = generate_tree(n, edges)
    result = []
    visited = [False] * (n+1)
    visited[1] = True
    stack = [1]
    while stack:
        node = stack.pop()
        for neighbor in tree[node]:
            if not visited[neighbor]:
                visited[neighbor] = True
                result.append((node, neighbor))
                stack.append(neighbor)
    return result

# Example usage
n = 4
edges = [(1, 2), (1, 3), (3, 4)]
result = generate_most_different_tree(n, edges)
for a, b in result:
    print(a, b)