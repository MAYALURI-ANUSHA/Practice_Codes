def generate_username(id_str):
    # Find the index of the first non-zero character in reverse order
    index = len(id_str) - 1
    while index >= 0 and id_str[index] == '0':
        index -= 1

    # The substring before the last non-zero character is a valid username
    username = id_str[:index]
    return username

# Input number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Input ID for each test case
    s = input()

    # Output the generated username
    print(generate_username(s))
