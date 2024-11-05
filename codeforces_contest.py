def divide_numbers(a, b):
    try:
        result = a / b  # This may raise a ZeroDivisionError
        print(f"The result of {a} divided by {b} is: {result}")
    except ZeroDivisionError:
        print("Error: Division by zero is not allowed!")
    except TypeError as e:
        print(f"Error: {e}")
    else:
        print("Division successful!")  # This block is executed if no exception occurs
    finally:
        print("This block is always executed, whether there was an error or not.")

# Example usage:
divide_numbers(10, 2)  # This should work fine
divide_numbers(10, 0)  # This will raise a ZeroDivisionError
divide_numbers("10", 2)  # This will raise a TypeError
