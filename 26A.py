# Function to solve each test case
def solve_test_case(n, k, a):
    max_count = 0  # Maximum count of k in a subsegment
    current_count = 0  # Current count of k in the current subsegment

    for i in range(n):
        if a[i] == k:
            current_count += 1
        else:
            max_count = max(max_count, current_count)
            current_count = 0

    max_count = max(max_count, current_count)

    if max_count >= 1:
        return "YES"
    else:
        return "NO"

# Main function
def main():
    t = int(input())  # Number of test cases
    results = []

    for _ in range(t):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        result = solve_test_case(n, k, a)
        results.append(result)

    for result in results:
        print(result)

if __name__ == "__main__":
    main()