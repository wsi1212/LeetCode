class Solution(object):
    def myAtoi(self, s):
        result = []
        minus = False
        sign = False
        for i in range(0, len(s)):
            if '0' <= s[i] <= '9':
                result.append(s[i])
            elif s[i] == '-' and sign == False:
                minus = True
                sign = True
            elif s[i] == '+' and sign == False:
                sign = True
                continue
            elif s[i] == ' ' and (('0' <= s[i + 1] <= '9') or (s[i + 1] == ' ' or '-' or '+')):
                continue
            else:
                break
        if result:
            result = int(''.join(result))
        else:
            result = 0
        if minus:
            result *= -1
        if result < 2147483648 * -1:
            result = 2147483648 * -1
        if result > 2147483647:
            result = 2147483647

        return result


a = Solution
print(a.myAtoi("", "00000-42a1234"))
