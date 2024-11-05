def calculate_power_difference(N, powers):
    powers.sort(reverse=True)
    power_difference = 0
    ironman_powers = []
    captain_powers = []

    for i in range(N):
        if i % 2 == 0:
            ironman_powers.append(powers[i])
        else:
            captain_powers.append(powers[i])

    power_difference = sum(ironman_powers) - sum(captain_powers)

    return power_difference

if __name__ == "__main__":
    N = int(input())
    powers = list(map(int, input().split()))

    power_difference = calculate_power_difference(N, powers)
    print(power_difference)