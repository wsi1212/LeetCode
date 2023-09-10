package DynamicProgramming

fun climbStairs(n: Int): Int {
    if (n == 1 || n == 2)
        return n
    var a = 1
    var b = 2
    var result = 1
    for (i:Int in 3..n) {
        result = a + b
        a = b
        b = result
    }
    return result
}

fun main() {
    print(climbStairs(5))
}
