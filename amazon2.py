import math

def calculate_distance(x, y):
    return math.sqrt(x**2 + y**2)

num_vertices = int(input())

vertices = []


for _ in range(num_vertices):
    x, y = map(int, input().split())
    vertices.append((x, y))


k = int(input())


vertices_with_distances = [(calculate_distance(x, y), (x, y)) for x, y in vertices]


sorted_vertices = sorted(vertices_with_distances, key=lambda x: x[0])

for i in range(min(k, len(sorted_vertices))):
    distance, (x, y) = sorted_vertices[i]
    print(x,y)