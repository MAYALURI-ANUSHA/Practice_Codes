# Define a function to check if it's possible to get array b from array a
def is_possible(n, k, b):
    a = [0] * n  # Initialize array a with zeros
    
    for i in range(n):
        if b[i] > a[i]:
            # Calculate the difference between b[i] and a[i]
            diff = b[i] - a[i]
            
            # Update the elements in the range [i % k, min(n, i % k + diff)] in array a
            for j in range(i % k, min(n, i % k + diff)):
                a[j] += 1
                
            # If the update is not possible, return "NO"
            if a[i] != b[i]:
                return "NO"
    
    # If we successfully transformed a into b, return "YES"
    return "YES"

# Read the number of test cases
t = int(input())

# Iterate through each test case
for _ in range(t):
    # Read input for the test case
    n, k = map(int, input().split())
    b = list(map(int, input().split()))
    
    # Check if it's possible to get array b from array a and print the result
    result = is_possible(n, k, b)
    print(result)