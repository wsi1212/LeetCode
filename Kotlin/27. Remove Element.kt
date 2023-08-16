fun removeElement(nums: IntArray, `val`: Int): Int {
    var k: Int
    var result = nums
    for (i: Int in nums.indices) {
        if (nums[i] == `val`) {
            result= remove(result,i)
        }
    }
    for (i:Int in nums.indices) {
        nums[i] = result[i]
    }

    k = result.size - result.count { it == -1 }
    return k
}

fun remove(arr: IntArray, index: Int): IntArray {
    if (index < 0 || index >= arr.size) {
        return arr
    }

    val result = arr.toMutableList()
    result[index] = -1
    return result.toIntArray()
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    print(removeElement(nums, 3))
}
