class Solution(object):
    def romanToInt(self, s):
        result = 0
        romanList = list(s)
        i = len(romanList)
        while True:
            i -= 1
            if i < 0:
                break
            if romanList[i] == 'I':
                result += 1
            elif romanList[i] == 'V':
                if romanList[i - 1] == 'I' and i > 0:
                    result += 4
                    i -= 1
                else:
                    result += 5
            elif romanList[i] == 'X':
                if romanList[i - 1] == 'I' and i > 0:
                    result += 9
                    i -= 1
                else:
                    result += 10
            elif romanList[i] == 'L':
                if romanList[i - 1] == 'X' and i > 0:
                    result += 40
                    i -= 1
                else:
                    result += 50
            elif romanList[i] == 'C':
                if romanList[i - 1] == 'X' and i > 0:
                    result += 90
                    i -= 1
                else:
                    result += 100
            elif romanList[i] == 'D':
                if romanList[i - 1] == 'C' and i > 0:
                    result += 400
                    i -= 1
                else:
                    result += 500
            elif romanList[i] == 'M':
                if romanList[i - 1] == 'C' and i > 0:
                    result += 900
                    i -= 1
                else:
                    result += 1000
        return result


a = Solution()
print(a.romanToInt("IV"))

"""
11ms 가장 좋은 코드
무지성 if 문이 아니라 파이썬 스럽게 딕셔너리를 써볼걸 한다
class Solution(object):
    def romanToInt(self, s):
        
        :type s: str
        :rtype: int
        
        roman_values = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }

        n = len(s)
        result = 0
        for i in range(n):
            if i < n - 1 and roman_values[s[i]] < roman_values[s[i + 1]]:
                result -= roman_values[s[i]]
            else:
                result += roman_values[s[i]]

        return result
"""
