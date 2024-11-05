# Function to calculate the total points for a given grid
def calculate_points(grid):
    points = 0
    ring_values = [5, 4, 3, 2, 1]

    for i in range(10):
        for j in range(10):
            if grid[i][j] == 'X':
                # Calculate the ring value based on Manhattan distance from the center
                if i==0 or j==0 or i==9 or j==9:
                    points=points+1
                elif i==1 or j==1 or i==8 or j==8:
                    points=points+2
                elif i==2 or j==2 or i==7 or j==7:
                    points=points+3
                elif i==3 or j==3 or i==6 or j==6:
                    points=points+4
                elif i==0 or j==0 or i==9 or j==9:
                    points=points+5

    return points

# Input the number of test cases
t = int(input())

# Process each test case
for _ in range(t):
    # Initialize an empty list to store the grid
    grid = []

    # Read 10 lines of the grid
    for _ in range(10):
        row = input().strip()  # Read a line and remove leading/trailing whitespace
        grid.append(row)  # Append the row to the grid list

    # Now you have the grid for the current test case in the 'grid' list
    # You can perform any required operations on the grid for this test case here


    # Calculate and print the total points for this test case
    result = calculate_points(grid)
    print(result)