package DynamicProgramming

fun findPaths(m: Int, n: Int, path1: Int, path2: Int, map: Array<IntArray>): Int {
    if (path1 == m || path2 == n)
        return 0
    if (path1 == m - 1 || path2 == n - 1)
        return 1
    if (map[path1][path2] != 0)
        return map[path1][path2]
    map[path1][path2] = findPaths(m, n, path1 + 1, path2, map) + findPaths(m, n, path1, path2 + 1, map)
    return map[path1][path2]
}

fun uniquePaths(m: Int, n: Int): Int {
    val map = Array(m) { IntArray(n) }
    return findPaths(m, n, 0, 0, map)
}

fun main() {
    print(uniquePaths(3, 2))
}