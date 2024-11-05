from collections import deque

def reverse_madness(t, test_cases):
    results = []
    
    for _ in range(t):
        n, k = test_cases[_][0], test_cases[_][1]
        s = deque(test_cases[_][2])
        l = test_cases[_][3]
        r = test_cases[_][4]
        q = test_cases[_][5]
        x_values = test_cases[_][6]
        
        x_ranges = {}  # Precompute index ranges
        
        for i in range(k):
            for x in range(l[i], r[i] + 1):
                a = min(x, r[i] + l[i] - x)
                b = max(x, r[i] + l[i] - x)
                x_ranges[x] = (a, b)
        
        for x in x_values:
            a, b = x_ranges[x]
            s.rotate(n - b)  # Batch reversal
            
        results.append("".join(s))
    
    return results

# Input reading
t = int(input())
test_cases = []

for _ in range(t):
    n, k = map(int, input().split())
    s = input().strip()
    l = list(map(int, input().split()))
    r = list(map(int, input().split()))
    q = int(input())
    x_values = list(map(int, input().split()))

    test_cases.append((n, k, s, l, r, q, x_values))

# Solve and output
results = reverse_madness(t, test_cases)
for result in results:
    print(result)