def can_make_daniel_and_tom_happy(n, candies):
    total_candies = sum(candies)
    
    # Check if the total candies can be evenly distributed
    if total_candies % n != 0:
        return "No"
    
    average_candies = total_candies // n
    
    excess_candies = 0
    swaps = []

    # Find pairs to swap candies until everyone has the average
    for i in range(n):
        needed_candies = average_candies - candies[i]
        
        if needed_candies > 0:
            # Find a person with excess candies to swap with
            for j in range(n):
                if candies[j] > average_candies and i != j:
                    given_candies = min(needed_candies, candies[j] - average_candies)
                    swaps.append((j+1, i+1, given_candies))
                    candies[i] += given_candies
                    candies[j] -= given_candies
                    excess_candies += given_candies
                    if candies[i] == average_candies:
                        break

    # Check if all candies are distributed and everyone has the average
    if excess_candies == total_candies and all(candy == average_candies for candy in candies):
        return "Yes"
    else:
        return "No"

# Input
t = int(input())
for _ in range(t):
    n = int(input())
    candies = list(map(int, input().split()))

    result = can_make_daniel_and_tom_happy(n, candies)
    print(result)