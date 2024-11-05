import sys

def play_game(n, s):
    # Initialize the set S with 0.
    S = set([0])
    last_added = 0

    # Bob's first move (remove any number from S).
    bob_move = int(input())
    S.remove(bob_move)

    for i in range(1, 2 * n + 1):
        # Alice's move: Add the next positive integer not in S.
        while last_added in S:
            last_added += 1
        print(last_added)
        sys.stdout.flush()

        # Bob's move: Remove a number from S.
        bob_move = int(input())
        if bob_move > last_added:
            # Bob made an invalid move or lost the game.
            return
        S.remove(bob_move)

    # Alice made 