class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        resultList = nums1 + nums2
        resultList = sorted(resultList)
        if len(resultList) % 2 == 0:
            return (resultList[len(resultList) // 2 - 1] + resultList[len(resultList) // 2]) / 2
        else:
            return resultList[len(resultList) // 2]


a = Solution
print(a.findMedianSortedArrays("", [1, 2], [3, 4]))
