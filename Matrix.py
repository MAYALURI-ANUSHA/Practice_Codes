def max_beauty(n, m):
    if n == 1 or m == 1:
        return 2
    else:
        return 1

def solve(n, m):
    if max_beauty(n, m) == 1:
        matrix = [[0] * m for _ in range(n)]
        num = 1
        for i in range(n):
            for j in range(m):
                matrix[i][j] = num
                num += 1
        return matrix
    else:
        matrix = [[1] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                matrix[i][j] = (i % 2) + 1
        return matrix

# Input
t = int(input())
for _ in range(t):
    n, m = map(int, input().split())

    max_b = max_beauty(n, m)
    matrix = solve(n, m)

    # Output
    print(max_b)
    for row in matrix:
        print(" ".join(map(str, row)))