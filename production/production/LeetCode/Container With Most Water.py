from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        result = 0
        left = 0
        right = len(height) - 1
        while right > left:
            if min(height[left], height[right]) * (right - left) > result:
                result = min(height[left], height[right]) * (right - left)
                print(left,right)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return result


a = Solution
print(a.maxArea("", [1, 8, 6, 2, 5, 4, 8, 3, 7]))
