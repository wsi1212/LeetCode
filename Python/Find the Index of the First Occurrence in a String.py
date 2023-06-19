class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        try:
            result = haystack.index(needle)
        except:
            result = -1
        return result
a = Solution
a.strStr("", "sadbutsad", "sad")