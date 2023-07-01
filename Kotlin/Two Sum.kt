class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i:Int in nums.indices) {
            for (j:Int in i until nums.size) {
                if (nums[i] + nums[j] == target && i != j) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    print(solution.twoSum(intArrayOf(2, 7, 11, 13), 9).toList())
}
