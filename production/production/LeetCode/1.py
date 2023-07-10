n = int(input())
a=0
b=0
c=0
d=0
for i in range(0, n):
    x,y,z = map(int, input().split(" "))
    if x == 1:
        d += 1
    else:
        if y == 1 or y == 2:
            a += 1
        elif y == 3:
            b += 1
        elif y == 4:
            c += 1
print(a)
print(b)
print(c)
print(d)