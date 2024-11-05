# Function to compute the lexicographically largest array
def compute_lexicographically_largest_array(n, c, k):
    a = [0] * n  # Initialize the array with zeros

    for i in range(n - 1, -1, -1):
        max_increment = min(k, c[i])  # Find the maximum increment for the current position
        a[i] = max_increment  # Update the current position
        k -= max_increment  # Update the available coins

    return a

# Number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    n = int(input())
    c = list(map(int, input().split()))
    k = int(input())

    result = compute_lexicographically_largest_array(n, c, k)
    print(*result)  # Print the lexicographically largest array for the current test case