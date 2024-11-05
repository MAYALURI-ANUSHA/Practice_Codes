class CustomStack:
    def __init__(self):
        self.text = ""
        self.cursor_position = 0
        self.command_stack = []

    def insert(self, value):
        self.text = self.text[:self.cursor_position] + value + self.text[self.cursor_position:]
        self.command_stack.append(("insert", value))

    def delete(self, value):
        deleted_text = self.text[self.cursor_position - value : self.cursor_position]
        self.text = (
            self.text[: self.cursor_position - value] + self.text[self.cursor_position:]
        )
        self.cursor_position -= value
        self.command_stack.append(("delete", deleted_text))

    def get(self, value):
        char_at_index = self.text[value]
        print(char_at_index)

    def undo(self):
        if not self.command_stack:
            return

        last_command, value = self.command_stack.pop()
        if last_command == "insert":
            self.text = (
                self.text[: self.cursor_position - len(value)]
                + self.text[self.cursor_position:]
            )
            self.cursor_position -= len(value)
        elif last_command == "delete":
            self.text = (
                self.text[: self.cursor_position] + value + self.text[self.cursor_position:]
            )
            self.cursor_position += len(value)


# Get input from the user
user_input = input("Enter tasks, choices, and values separated by commas and spaces: ")

# Create an instance of CustomStack
stack = CustomStack()

# Split the input into tasks
tasks = user_input.split(',')

# Process each task
for task in tasks:
    # Split each task into choice and value
    command, value = task.strip().split(' ')

    # Perform the corresponding operation
    if command == "1":
        stack.insert(value)
    elif command == "2":
        stack.delete(int(value))
    elif command == "3":
        stack.get(int(value))
    elif command == "4":
        stack.undo()

# Print the final text
print("Final Text:", stack.text)