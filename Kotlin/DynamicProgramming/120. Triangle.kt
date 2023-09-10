package DynamicProgramming

import kotlin.math.min

fun findPath(triangle: List<List<Int>>, x: Int, y: Int, memo:Array<IntArray>):Int {
    if (y > x)
        return 0
    if (x == triangle.size - 1) {
        return triangle[x][y]
    }
    if (memo[x][y] != -1) {
        return memo[x][y]
    }
    val result = min(
        findPath(triangle, x + 1, y, memo),
        findPath(triangle, x + 1, y + 1, memo)
    ) + triangle[x][y]

    memo[x][y] = result
    return result
}

fun minimumTotal(triangle: List<List<Int>>): Int {
    val memo = Array(triangle.size) { IntArray(triangle.size + 1) { -1 } }
    return findPath(triangle, 0, 0, memo)
}

fun main() {
    val test = listOf(
        listOf(2),
        listOf(3, 4),
        listOf(6, 5, 7),
        listOf(4, 1, 8, 3)
    )
    print(minimumTotal(test))
}

//2],[3,4],[6,5,7],[4,1,8,3