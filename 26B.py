import sys

def generate_array(n):
    a = [1] * n
    a[-1] = 3
    for i in range(n - 2, 0, -1):
        a[i] = a[i + 1] + 1
    return a

def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        result = generate_array(n)
        print(" ".join(map(str, result)))

if __name__ == "__main__":
    main()