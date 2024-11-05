def construct_pseudotree(n, degrees):
    # Initialize the list to store the edges
    edges = []

    # Create a list to store vertices with degree 1 and degree 2
    degree_1 = []
    degree_2 = []

    # Separate vertices into degree 1 and degree 2 lists
    for i in range(n):
        if degrees[i] == 1:
            degree_1.append(i)
        elif degrees[i] == 2:
            degree_2.append(i)

    # Check if it's possible to construct a flower-like pseudotree
    if len(degree_1) % 2 == 0:
        # Connect vertices with degree 1 and degree 2 alternately to form edges
        for i in range(0, len(degree_1), 2):
            edges.append((degree_1[i], degree_1[i + 1]))

        # Connect remaining vertices with degree 2 to the last vertex with degree 1
        for i in range(0, len(degree_2), 2):
            edges.append((degree_2[i], degree_1[-1]))
    else:
        # If the number of vertices with degree 1 is odd, it's not possible to construct a flower-like pseudotree
        return None

    return edges

# Input
t = int(input())
for _ in range(t):
    n = int(input())
    degrees = list(map(int, input().split()))

    # Construct the pseudotree
    edges = construct_pseudotree(n, degrees)

    if edges is None:
        print("No")
    else:
        print("Yes")
        for u, v in edges:
            print(u + 1, v + 1)