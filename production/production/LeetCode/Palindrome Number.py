class Solution(object):
    def isPalindrome(self, x):
        x = list(map(str, (input())))
        a = list(x)
        x.reverse()
        return ''.join(a) == ''.join(x), a, x


