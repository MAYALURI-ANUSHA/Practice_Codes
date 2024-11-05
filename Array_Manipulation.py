n=int(input())
k=int(input())
l=[]
for i in range(k):
    l.append(list(map(int,input().split())))
array=[0]*n
for i in l:
    a=i[0]
    b=i[1]
    p=i[2]
    for k in range(a,b+1):
        array[k-1]+=p
print(max(array))