import kotlin.math.max

fun rob(nums: IntArray): Int {
    val memo = IntArray(100) {0}
    memo[0] = nums[0]
    if (nums.size >= 2)
        memo[1] = max(nums[0], nums[1])
    for (i:Int in 2 until nums.size) {
        memo[i] = max(memo[i - 2] + nums[i], memo[i-1])
    }
    return memo[nums.size - 1]
}

fun main() {
    print(rob(intArrayOf(2,7,9,3,1)))
}