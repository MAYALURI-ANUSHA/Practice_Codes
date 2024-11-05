class QueueUsingTwoStacks:
    def __init__(self):
        self.stack1 = []  # For enqueue
        self.stack2 = []  # For dequeue and print front

    def enqueue(self, element):
        # To enqueue, simply push the element onto stack1
        self.stack1.append(element)

    def dequeue(self):
        # To dequeue, check if stack2 is empty. If it is, transfer elements from stack1 to stack2.
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())

        # Pop the element from stack2
        if self.stack2:
            return self.stack2.pop()
        else:
            print("Queue is empty.")
            return None

    def print_front(self):
        # To print the front, check if stack2 is empty. If it is, transfer elements from stack1 to stack2.
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())

        # Print the front element without removing it
        if self.stack2:
            print(self.stack2[-1])
        else:
            print("Queue is empty.")

# Example usage:
queue = QueueUsingTwoStacks()

tasks = input()
tasks_list = tasks.split(',')

for task in tasks_list:
    task_parts = task.split()
    choice = int(task_parts[0])

    if choice == 1:
        element = int(task_parts[1])
        queue.enqueue(element)
    elif choice == 2:
        queue.dequeue()
    elif choice == 3:
        queue.print_front()
    else:
        print("Invalid choice. Please enter 1, 2, or 3.")