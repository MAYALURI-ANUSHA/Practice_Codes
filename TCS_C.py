def is_valid_move(maze, visited, r, c, max_twos):
    rows, cols = len(maze), len(maze[0])

    # Check if the move is within the maze boundaries
    if 0 <= r < rows and 0 <= c < cols:
        # Check if the move has not been visited and does not contain an obstacle (1)
        if visited[r][c] == 0 and maze[r][c] != 1:
            # Check if the move does not exceed the maximum allowed twos
            if maze[r][c] == 2 and max_twos == 0:
                return False
            return True
    return False

def dfs(maze, visited, r, c, target_r, target_c, distance, max_twos):
    rows, cols = len(maze), len(maze[0])

    # Base case: if the current position is the target block, return the distance
    if r == target_r and c == target_c:
        return distance

    # Mark the current position as visited
    visited[r][c] = 1

    # Possible moves: up, down, left, right
    moves = [(r - 1, c), (r + 1, c), (r, c - 1), (r, c + 1)]

    min_distance = float('inf')

    for move_r, move_c in moves:
        if is_valid_move(maze, visited, move_r, move_c, max_twos):
            new_distance = dfs(maze, visited, move_r, move_c, target_r, target_c, distance + 1, max_twos - (maze[move_r][move_c] == 2))
            min_distance = min(min_distance, new_distance)

    # Backtrack: mark the current position as unvisited
    visited[r][c] = 0

    return min_distance

def shortest_path(maze, start, target):
    rows, cols = len(maze), len(maze[0])
    start_r, start_c = start
    target_r, target_c = target

    # Initialize visited array
    visited = [[0] * cols for _ in range(rows)]

    # Perform DFS to find the shortest path
    result = dfs(maze, visited, start_r, start_c, target_r, target_c, 0, 2)

    return result if result != float('inf') else "STUCK"

# Example usage
if __name__ == "__main__":
    R, C = map(int, input().split())
    maze = [list(map(int, input().split())) for _ in range(R)]
    start = tuple(map(int, input().split()))
    target = tuple(map(int, input().split()))

    result = shortest_path(maze, start, target)
    print(result)
