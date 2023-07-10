n = int(input())
str = [1]#현재항
temp = [1]#이전항
for i in range(0, n-1):
    temp = str
    str = []
    for j in range(0, len(temp)):
        near = 0
        nearV = 0
        if j+1 <= len(temp)-1 and temp[j] == temp[j+1]:
            while temp[j] == temp[j+1]:
                near += 1
                j+=1
                nearV = temp[j]
                if j >= len(temp) - 1:
                    break
            print(j)
        if near != 0:
            str.append(nearV)
            str.append(temp.count(near))
        else:
            str.append(temp[j])
            str.append(1)
print(str)
