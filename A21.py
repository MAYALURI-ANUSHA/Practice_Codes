# Function to check if the row can become "abc" with one swap
def can_become_abc(s):
    k=["abc","acb","bac","cba"]
    return s in k

# Input the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Input the string representing the cards
    s = input()

    # Check if the row can become "abc" with one swap
    if can_become_abc(s):
        print("YES")
    else:
        print("NO")