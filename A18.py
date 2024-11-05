# Function to find the maximum sum of elements in a valid array
def max_sum_for_array(n, k, x):
    p=[]
    for i in range(x):
        if i!=k:
            p.append(i)
    m=max(p)
    s=sum(p)+(m*(n-x+1))
    return s
# Number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    n, k, x = map(int, input().split())
    max_sum = max_sum_for_array(n, k, x)
    
    if max_sum == 0:
        print(-1)
    else:
        print(max_sum)