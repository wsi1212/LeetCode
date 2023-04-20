class Solution:
    def reverse(self, x):
        reverseX = list(str(x))
        reverseX.reverse()
        i = 0
        if x == 0:
            return 0
        while reverseX[i] == '0':
            i += 1
        if '-' in reverseX:
            result = int(''.join(reverseX[i:-1]))
        else:
            result = int(''.join(reverseX[i:]))
        if '-' in reverseX:
            result *= -1
        if result > 2147483647 or result <= -2147483648:
            return 0
        return result


a = Solution
print(a.reverse("", 1534236469))
