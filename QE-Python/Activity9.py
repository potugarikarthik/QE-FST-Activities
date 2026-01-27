l = [1,2,3,4,5]
l1 = [6,7,8,9]
newlist = []
for i in l :
    if i % 2 !=0:
        newlist.append(i)
for i in l1:
    if i %2 == 0:
        newlist.append(i)
print(newlist)