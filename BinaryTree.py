class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def insert(root, val):
    if root is None:
        return TreeNode(val)
    if val < root.val:
        root.left = insert(root.left, val)
    else:
        root.right = insert(root.right, val)
    return root

def build_binary_search_tree(elements):
    root = None
    for element in elements:
        if element != 'n':
            root = insert(root, int(element))
    return root

def pre_order_traversal(node):
    if node:
        print(node.val, end=" ")
        pre_order_traversal(node.left)
        pre_order_traversal(node.right)

def post_order_traversal(node):
    if node:
        post_order_traversal(node.left)
        post_order_traversal(node.right)
        print(node.val, end=" ")

def in_order_traversal(node):
    if node:
        in_order_traversal(node.left)
        print(node.val, end=" ")
        in_order_traversal(node.right)

# Input the total number of elements and the list
total_elements = int(input("Enter the total number of elements: "))
elements = input("Enter the list of elements separated by spaces (use 'n' for null values): ").split()

# Ensure the input length is correct
if len(elements) != total_elements:
    print("Invalid input!")
else:
    root = build_binary_search_tree(elements)

    print("Pre-order traversal:")
    pre_order_traversal(root)
    print("\n")

    print("Post-order traversal:")
    post_order_traversal(root)
    print("\n")

    print("In-order traversal:")
    in_order_traversal(root)
    print("\n")