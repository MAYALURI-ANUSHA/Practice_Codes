import sys

def query(i):
    print(f"? {i}")
    sys.stdout.flush()
    return int(input())

def solve_test_case():
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    
    result = 0
    for i in range(n - k + 1):
        if i % 2 == 0:
            result ^= a[i]
    
    print(f"! {result}")
    sys.stdout.flush()

# Read the number of test cases
t = int(input())

for _ in range(t):
    solve_test_case()