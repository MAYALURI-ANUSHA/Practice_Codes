# Function to calculate the minimum number of operations needed to remove black cells
def min_operations_to_remove_black_cells(n, k, s):
    operations = 0
    consecutive_black = 0

    for i in range(n):
        if s[i] == 'B':
            consecutive_black += 1
        else:
            continue

        if consecutive_black == k:
            operations += 1
            consecutive_black = 0

    # If there are remaining consecutive black cells, perform an additional operation
    if consecutive_black > 0:
        operations += 1

    return operations

# Input the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Input n, k, and the string s
    n, k = map(int, input().split())
    s = input().strip()

    # Calculate and print the minimum number of operations
    result = min_operations_to_remove_black_cells(n, k, s)
    print(result)