package DynamicProgramming

private fun findMin(grid: Array<IntArray>, row: Int, currency: Int): Int {
    var min = Int.MAX_VALUE
    for (i in grid[row].indices) {
        if (i != currency && grid[row][i] <= min) {
            min = grid[row][i]
        }
    }
    return min
}

private fun minFallingPathSum(grid: Array<IntArray>): Int {
    for (i in 1 until grid.size) {
        for (j in grid.indices) {
            grid[i][j] += findMin(grid, i - 1, j)
        }
    }
    return grid.last().min()
}

fun main() {
    val test = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9))
    println(minFallingPathSum(test))
}
