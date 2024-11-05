def min_swaps_to_beautiful(arr):
    n = len(arr)

    # Helper function to count swaps
    def count_swaps(arr, order):
        swaps = 0
        for i in range(n):
            for j in range(i + 1, n):
                if (order == 'asc' and arr[i] > arr[j]) or (order == 'desc' and arr[i] < arr[j]):
                    swaps += 1
        return swaps

    # Find the index of the smallest element
    min_index = arr.index(min(arr))

    # Check whether the smallest element is in the first half or second half
    if min_index >= n // 2:
        # If in the second half, find only desc_swaps
        return count_swaps(arr, 'desc')
    else:
        # If in the first half, find only asc_swaps
        return count_swaps(arr, 'asc')

# Input
n = int(input())
arr = list(map(int, input().split()))

# Output
print(min_swaps_to_beautiful(arr))