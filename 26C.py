def can_choose_numbers(n, k, x):
    # Calculate the minimum and maximum possible sum of k distinct integers between 1 and n
    min_sum = k * (k + 1) // 2
    max_sum = n * (n + 1) // 2 - (n - k) * (n - k + 1) // 2

    # Check if x is within the valid range
    if x >= min_sum and x <= max_sum:
        return "YES"
    else:
        return "NO"

# Input
t = int(input())
for _ in range(t):
    n, k, x = map(int, input().split())
    result = can_choose_numbers(n, k, x)
    print(result)