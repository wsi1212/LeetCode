fun jump(nums: IntArray): Int {
    val n = nums.size
    var answer = 0
    var curFar = 0
    var curEnd = 0
    for (i in 0 until n - 1) {
        curFar = maxOf(curFar, i + nums[i])
        if (i == curEnd) {
            answer++
            curEnd = curFar
        }
    }
    return answer
}

fun main() {
    println(jump(intArrayOf(1, 1, 1, 1)))
}
