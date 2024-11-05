# Function to count numbers where representation matches their position
def count_matching_positions(n, k):
    power = 1
    count = 0

    while n > 0:
        # Calculate the number of values with the same prefix
        same_prefix_count = min(k - 1, n)

        # Update the count with values that match their position
        count += same_prefix_count // power

        # Move to the next digit
        n //= k
        power *= k

    return count

# Number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    n, k = map(int, input().split())
    result = count_matching_positions(n, k)
    print(result)