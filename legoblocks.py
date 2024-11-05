MOD = 10**9 + 7
MAX_SIZE = 1000 + 1
UNKNOWN = -1
all_solutions = [[UNKNOWN] * MAX_SIZE for _ in range(MAX_SIZE)]
solid_solutions = [[UNKNOWN] * MAX_SIZE for _ in range(MAX_SIZE)]
def get_all_solutions(height, width):
    if all_solutions[height][width] != UNKNOWN:
        return all_solutions[height][width]
    count = 0
    if width == 1:
        count = 1
    elif height == 1:
        if width <= 4:
            count = 2 * get_all_solutions(1, width - 1)
        else:
            count = 0
            for i in range(1, 5):
                count += get_all_solutions(1, width - i)
                count %= MOD
    else:
        one_row_solutions = get_all_solutions(1, width)

        count = 1
        for _ in range(height):
            count *= one_row_solutions
            count %= MOD
    all_solutions[height][width] = count
    return all_solutions[height][width]
def get_solid_solutions(height, width):
    if solid_solutions[height][width] != UNKNOWN:
        return solid_solutions[height][width]
    count = 0
    if width == 1:
        count = 1
    else:
        count = get_all_solutions(height, width)
        for i in range(1, width):
            a = get_all_solutions(height, i)
            b = get_solid_solutions(height, width - i)
            count -= (a * b) % MOD
            if count < 0:
                count += MOD

    solid_solutions[height][width] = count
    return solid_solutions[height][width]
def main():
    height, width = map(int, input().split())
    print(get_solid_solutions(height, width))
if __name__ == "__main__":
    main()