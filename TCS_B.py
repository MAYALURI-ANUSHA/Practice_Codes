def count_possibilities(row):
    count = 0
    for i in range(len(row) - 2):
        if row[i:i+3] == 'MLM':
            count += 1
    return count

def find_winner(ashok_row, anand_row):
    ashok_possibilities = count_possibilities(ashok_row)
    anand_possibilities = count_possibilities(anand_row)

    if ashok_possibilities > anand_possibilities:
        return "Ashok"
    elif ashok_possibilities < anand_possibilities:
        return "Anand"
    else:
        return "Draw"

# Input
ashok_row = input().strip()
anand_row = input().strip()

# Output
result = find_winner(ashok_row, anand_row)
print(result)
