package DynamicProgramming

fun fib(n: Int): Int {
    val fibArr = IntArray(31)
    fibArr[0] = 0
    fibArr[1] = 1
    for (i:Int in 2..n) {
        fibArr[i] = fibArr[i - 1] + fibArr[i - 2]
    }
    return fibArr[n]
}

fun main() {
    print(fib(30))
}