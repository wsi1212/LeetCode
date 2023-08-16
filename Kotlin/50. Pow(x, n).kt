fun myPow(x: Double, n: Int): Double {
    val num: Double = if (n < 0) 1/x else x
    var power: Long = Math.abs(n.toLong())
    var product: Double = num
    var res: Double = 1.0
    while (power > 0) {
        if (power%2 == 1L) {
            res = res * product
        }
        power = power/2
        product = product * product
    }
    return res
}

fun main() {
    println(myPow(10.0, -3))
}
