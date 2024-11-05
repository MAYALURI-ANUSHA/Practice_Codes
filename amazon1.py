def process_string(s, k):
    vowels = "AEIOUaeiou"
    result = []

    for char in s:
        if char in vowels:
            k += 2
            result.append(str(ord(char) * k))
        else:
            k += 1
            result.append(str(ord(char) * k))

    return " ".join(result)

# Read input
string_input = input().strip()
k = int(input().strip())

# Call the function and print the result
output = process_string(string_input, k)
print(output)