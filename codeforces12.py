def sum_of_digits(x):
    return sum(map(int, str(x)))

def calculate_result(n, arr):
    precalculated_sums = [sum_of_digits(i) for i in range(1, 82)]

    result = []
    total_sum = sum(arr)

    for a in arr:
        result.append(n * precalculated_sums[sum_of_digits(a)] + total_sum)

    return result

# Input reading
n = int(input())
arr = list(map(int, input().split()))

# Calculate and print the result
result = calculate_result(n, arr)
print(*result)
