package DynamicProgramming

import kotlin.math.max

fun deleteAndEarn(nums: IntArray): Int {
    var maxN = 0
    for (i:Int in nums) {
        if (i >= maxN)
            maxN = i
    }
    val numsArr = IntArray(maxN + 1)
    for (i:Int in nums) {
        numsArr[i] += i
    }
    for (i:Int in 2 until numsArr.size) {
        numsArr[i] = max(numsArr[i-2] + numsArr[i], numsArr[i-1])
    }
    return numsArr[numsArr.size - 1]
}

fun main() {
    print(deleteAndEarn(intArrayOf(2,2,3,3,3,4)))
}