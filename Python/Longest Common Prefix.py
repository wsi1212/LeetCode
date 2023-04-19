strs = ["flower","flow","flight"]
result = []

for i in zip(*strs):
    if len(set(i)) == 1:
        result.append(str(i[0]))
    else:
        break
result = ''.join(result)
print(result)

