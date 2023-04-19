class Solution(object):
    def intToRoman(self, num):
        result = []
        while num >= 1000:
            result.append('M')
            num -= 1000
        if num >= 900:
            result.append('C')
            result.append('M')
            num -= 900
        if num >= 500:
            result.append('D')
            num -= 500
        if num >= 400:
            result.append('C')
            result.append('D')
            num -= 400
        while num >= 100:
            result.append('C')
            num -= 100
        if num >= 90:
            result.append('X')
            result.append('C')
            num -= 90
        if num >= 50:
            result.append('L')
            num -= 50
        if num >= 40:
            result.append('X')
            result.append('L')
            num -= 40
        while num >= 10:
            result.append('X')
            num -= 10
        if num >= 9:
            result.append('IX')
            num -= 9
        if num >= 5:
            result.append('V')
            num -= 5
        if num >= 4:
            result.append('IV')
            num -= 4
        while num >= 1:
            result.append('I')
            num -= 1
        return ''.join(result)


a = Solution
print(a.intToRoman("", 3))

"""
11ms로 가장 좋은 코드, 이것은 두 리스트에 담아서 따로 처리함
class Solution(object):
    def intToRoman(self, num):
        symbol = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        value = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        roman_numeral = ""
        i = 0
        while num > 0:
            if num >= value[i]:
                roman_numeral += symbol[i]
                num -= value[i]
            else:
                i += 1
        return roman_numeral"""