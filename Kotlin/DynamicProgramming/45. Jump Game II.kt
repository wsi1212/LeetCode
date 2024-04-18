fun jump(nums: IntArray): Int {
    val n = nums.size
    var answer = 0
    var curFar = 0
    var curEnd = 0
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
