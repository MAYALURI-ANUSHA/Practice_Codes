def kth_smallest(nums,queries):
    results=[]
    for query in queries:
        k,trim=query
        trimmed_nums=[int(num[-trim:]) for num in nums]
        sorted_nums=sorted(enumerate(trimmed_nums),key=lambda x:x[1])
        kth_smallest_index=sorted_nums[k-1][0]
        original_nums=[int(num) for num in nums]
        results.append(original_nums.index(original_nums[kth_smallest_index]))
    return (" ".join(map(str,results)))
nums=list(input().split(" "))
n=int(input())
queries=[]
for i in range(n):
    queries.append(list(map(int,input().split(" "))))
print(kth_smallest(nums,queries))
