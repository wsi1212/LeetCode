fun findPath(m: Int, n: Int, path1: Int, path2: Int, grid: Array<IntArray>, obstacleGrid: Array<IntArray>): Int {
    if (path1 == m || path2 == n || grid[path1][path2] == 1) {
        return 0
    }
    if (m == 1 && n == 1 && grid[0][0] == 0 || (grid[m - 1][n - 1] == 0 && path1 == m - 1 && path2 == n - 1)) {
        return 1
    }
    if ((path1 == m - 1 && findPath(m, n, path1, path2 + 1, grid, obstacleGrid) != 0) || (path2 == n - 1 && findPath(m, n, path1 + 1, path2, grid, obstacleGrid) != 0)) {
        return 1
    }
    if (obstacleGrid[path1][path2] != 0)
        return obstacleGrid[path1][path2]
    obstacleGrid[path1][path2] = findPath(m, n, path1 + 1, path2, grid, obstacleGrid) + findPath(m, n, path1, path2 + 1, grid, obstacleGrid)
    return obstacleGrid[path1][path2]
}

fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
    val m = obstacleGrid.size
    val n = obstacleGrid[0].size
    val dp = Array(m) {IntArray(n) {0} }
    return findPath(m, n, 0, 0, obstacleGrid, dp)
}

fun main() {
    var test = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 1, 0),
        intArrayOf(0, 0, 0),
    )
    print(uniquePathsWithObstacles(test))
}
