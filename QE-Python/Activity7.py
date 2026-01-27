n = int(input("Enter number of elements in the list"))
l = [0] * n
sum = 0
for i in range(n):
    j = int(input("enter new list element"))
    l.append(j)
    sum = sum+j
print(sum)