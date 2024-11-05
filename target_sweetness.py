def min_steps_to_target_sweetness(target, candies):
    candies.sort()  # Sort the candies in ascending order
    steps = 0

    while candies[0] < target:
        # Combine the two least sweet candies
        combined_sweetness = candies[0] + 2*candies[1]
        candies = candies[2:] + [combined_sweetness]
        candies.sort()  # Sort the updated candies

        steps += 1

    return steps

# Read input from the user
target_sweetness = int(input())
candies = list(map(float, input().split()))

# Call the function with user-input values
result = min_steps_to_target_sweetness(target_sweetness, candies)
print(result)