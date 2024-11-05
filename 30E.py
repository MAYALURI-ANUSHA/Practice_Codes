def min_operations(a, b, c, d, m):
    if (a | b) != (c | d):
        return -1

    ans = float('inf')
    for i in range(32):
        mask = 1 << i
        if c & mask:
            cnt = bin(b).count('1')
            if (a & mask) == 0:
                cnt += 1
            ans = min(ans, cnt)
        elif (a & mask) and (b & mask):
            return -1

    return ans

def main():
    t = int(input())
    for _ in range(t):
        a, b, c, d, m = map(int, input().split())
        result = min_operations(a, b, c, d, m)
        print(result)

if __name__ == "__main__":
    main()