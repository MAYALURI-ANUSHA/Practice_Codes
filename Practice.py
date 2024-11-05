s=input()
l=list(s)
def count(k,s):
    c=0
    for i in s:
        if i==k:
            c=c+1
    return c
p=[]
result=0
for i in set(s):
    if count(i,l) not in p:
        p.append(count(i,l))
    else:
        k=count(i,l)
        while k in p:
            k=k-1
            l.remove(i)
            result=result+1
            print(i,k,result)
        if k>0:
            p.append(count(i,l))
print(result)