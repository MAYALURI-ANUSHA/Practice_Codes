def calculate_xor_palindrome(s):
    n = len(s)
    result = [0] * (n + 1)
    ones_count = s.count('1')
    prefix_xor = [0] * (n + 1)

    for i in range(n):
        prefix_xor[i + 1] = prefix_xor[i] ^ int(s[i])

    for i in range(n):
        for j in range(i, n):
            length = j - i + 1
            if length % 2 == 1:
                mid = (i + j) // 2
                if prefix_xor[mid + 1] ^ prefix_xor[i] == 0:
                    result[length + ones_count] += 1
            else:
                mid1 = (i + j) // 2
                mid2 = mid1 + 1
                if prefix_xor[mid1 + 1] ^ prefix_xor[i] == 0 and prefix_xor[mid2 + 1] ^ prefix_xor[mid2] == 0:
                    result[length + ones_count] += 1

    return result

def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        s = input().strip()
        result = calculate_xor_palindrome(s)
        print("".join(map(str, result)))

if __name__ == "__main__":
    main()