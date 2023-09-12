package DynamicProgramming

fun findMaxSquare(matrix: Array<CharArray>, x: Int, y: Int, max: Int, memo: Array<IntArray>):Int {
    var maxTemp = 1
    if (x < 0 || y < 0) {
        return 0
    }
    if (matrix[x][y] == '0') {
        memo[x][y] = 0
        return 0
    }
    if (memo[x][y] != -1) {
        return memo[x][y]
    }
    if (matrix[x][y] == '1' && (x == 0 || y == 0)) {
        memo[x][y] = 1
        return 1
    }
    if (findMaxSquare(matrix, x - 1, y, max, memo) != 0 &&
        findMaxSquare(matrix, x, y - 1, max, memo) != 0 &&
        findMaxSquare(matrix, x - 1, y - 1, max, memo) != 0) {
        maxTemp += minOf(findMaxSquare(matrix, x - 1, y, max, memo),
                findMaxSquare(matrix, x, y - 1, max, memo),
                findMaxSquare(matrix, x - 1, y - 1, max, memo))
    }
    memo[x][y] = maxTemp
    return maxTemp
}

fun maximalSquare(matrix: Array<CharArray>): Int {
    var max = 0
    val memo = Array(matrix.size) {IntArray(matrix[0].size) { -1 }}
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            var temp = findMaxSquare(matrix, i, j, 0, memo)
            temp *= temp
            if (temp > max) {
                max = temp
            }
        }
    }
    return max
}

fun main() {
    val test :Array<CharArray> = arrayOf(
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '1', '1', '0'),
        charArrayOf('1', '1', '1', '1', '1'),
        charArrayOf('1', '1', '1', '1', '1'),
        charArrayOf('0', '0', '1', '1', '1'),
    )
    println(maximalSquare(test))
}

//["1","1","1","1","0"],["1","1","1","1","0"],["1","1","1","1","1"],["1","1","1","1","1"],["0","0","1","1","1"]