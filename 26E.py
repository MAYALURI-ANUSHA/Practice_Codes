def find_maximal_index(n, a, queries):
    max_index = [-1] * n
    stack = []

    for i in range(n - 1, -1, -1):
        while stack and a[i] & a[stack[-1]] >= a[i]:
            stack.pop()
        stack.append(i)

    for i in range(len(queries)):  # Iterate through queries
        l, k = queries[i]
        while stack and a[l - 1] & a[stack[-1]] >= k:  # Note the change here
            max_index[i] = stack[-1] + 1
            stack.pop()

    return max_index

t = int(input())
results = []

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    q = int(input())
    queries = [list(map(int, input().split())) for _ in range(q)]
    max_index = find_maximal_index(n, a, queries)
    results.append(max_index)

for max_index in results:
    print(" ".join(map(str, max_index)))