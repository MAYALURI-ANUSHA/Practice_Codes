a=['5', '3', '4', '6', '7', '8', '9', '1', '2','6', '7', '2', '1', '9', '5', '3', '4', '8','1', '9', '8', '3', '4', '2', '5', '6', '7','8', '5', '9', '7', '6', '1', '4', '2', '3','4', '2', '6', '8', '5', '3', '7', '9', '1','7', '1', '3', '9', '2', '4', '8', '5', '6','9', '6', '1', '5', '3', '7', '2', '8', '4','2', '8', '7', '4', '1', '9', '6', '3', '5','3', '4', '5', '2', '8', '6', '1', '7', '9']
b=[]
for i in a:
    b.append(int(i))
def validsudoku(l):
    p=0
    q=9
    r=0
    while r<9:
        if sum(b[p:q])!=45:
            return "No"
        p+=9
        q+=9
        r+=1
    m=0
    n=0
    while n<9:
        if sum(b[m:81:9])!=45:
            return "No"
        m+=1
        n+=1
    x=0
    h=0
    while h<3:
        if sum((b[x:x+3])+(b[x+9:x+12])+(b[x+18:x+21]))!=45:
            return "No"
        if sum((b[x+3:x+6])+(b[x+12:x+15])+(b[x+21:x+24]))!=45:
            return "No"
        if sum((b[x+6:x+9])+(b[x+15:x+18])+(b[x+24:x+27]))!=45:
            return "No"
        h+=1
        x+=27
    return "Yes"
print(validsudoku(a))