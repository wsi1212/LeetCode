package DynamicProgramming

private fun minFallingPathSum(matrix: Array<IntArray>): Int {
    for (i in 1 until matrix.size) {
        for (j in matrix.indices) {
            matrix[i][j] += minOf(if (j > 0) matrix[i - 1][j - 1] else Int.MAX_VALUE, matrix[i - 1][j],if (j != matrix.size - 1) matrix[i - 1][j + 1] else Int.MAX_VALUE)
        }
    }
    return matrix.last().min()
}

fun main() {
    val test = arrayOf(
        intArrayOf(2, 1, 3),
        intArrayOf(6, 5, 4),
        intArrayOf(7, 8, 9))
    println(minFallingPathSum(test))
}
