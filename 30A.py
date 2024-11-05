def solve_test_case(a, b, n, x):
    # Sort the tools in ascending order
    x.sort()
    
    time_elapsed = 0
    
    for i in range(n):
        if b <= a // 2:
            break
        b += x[i]
        time_elapsed += 1
    
    return time_elapsed + (b - 1) // 2

t = int(input())

for _ in range(t):
    a, b, n = map(int, input().split())
    x = list(map(int, input().split()))
    
    result = solve_test_case(a, b, n, x)
    print(result)