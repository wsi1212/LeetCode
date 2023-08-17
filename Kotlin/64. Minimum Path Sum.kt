import kotlin.math.min
fun minPathSum(grid: Array<IntArray>): Int {
    for (i:Int in 0 until grid.size) {
        for (j:Int in 0 until grid[0].size) {
            if (i != 0 && j != 0)
                grid[i][j] += min(grid[i - 1][j], grid[i][j - 1])
            else if (j == 0 && i != 0) {
                grid[i][j] += grid[i - 1][j]
            } else if (i == 0 && j != 0) {
                grid[i][j] += grid[i][j - 1]
            }
        }
    }
    return grid[grid.size - 1][grid[0].size - 1]
}

fun main() {
    val test = arrayOf(intArrayOf(1,3,1),
        intArrayOf(1,5,1),
        intArrayOf(4,2,1))
    print(minPathSum(test))
}