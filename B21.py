# Function to calculate the maximum product
def max_product(n, digits):
    # Initialize variables to keep track of the number of zeroes and the product
    num_zeroes = 0
    product = 1

    # Iterate through the digits
    for digit in digits:
        if digit == 0:
            # Count the number of zeroes
            num_zeroes += 1
        else:
            # Multiply the product by the non-zero digits
            product *= digit

    # If there are no zeroes, subtract 1 from the smallest non-zero digit to maximize the product
    if num_zeroes == 0:
        min_non_zero_digit = min(digits)
        product=product//min_non_zero_digit
        product=product*(min_non_zero_digit+1)
        return product
    elif num_zeroes==1:
        return product
    else:
        return 0
    
# Input the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Input the number of digits and the array of digits
    n = int(input())
    digits = list(map(int, input().split()))

    # Calculate and print the maximum product for this test case
    result = max_product(n, digits)
    print(result)