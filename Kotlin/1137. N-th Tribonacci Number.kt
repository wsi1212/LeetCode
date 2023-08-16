fun tribonacci(n: Int): Int {
    val triArr = IntArray(40)
    triArr[0] = 0
    triArr[1] = 1
    triArr[2] = 1
    for (i: Int in 3..n) {
        triArr[i] = triArr[i - 1] + triArr[i - 2] + triArr[i - 3]
    }
    return triArr[n]
}

fun main() {
    println(tribonacci(36))
}
