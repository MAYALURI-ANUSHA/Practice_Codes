def longest_good_subarray(n, k, a):
    max_count = 0
    max_value = 0
    current_count = 0

    for i in range(n):
       

        if a[i] == max_value:
            current_count += 1
        else:
            max_value = a[i]
            current_count = 1

        max_count = max(max_count, current_count)
        print(f"i: {i}, a[i]: {a[i]}, max_value: {max_value}, current_count: {current_count}, max_count: {max_count}")

    return min(max_count, k)

# Input processing
t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))

    # Output the result for each testcase
    result = longest_good_subarray(n, k, a)
    print(result)
