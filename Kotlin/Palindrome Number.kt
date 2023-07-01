fun isPalindrome(x: Int): Boolean {
    var xReverse : Int = 0
    var temp = x
    while (temp >= 1) {
        xReverse *= 10
        xReverse += temp % 10
        temp = temp.div(10)
    }
    if (0 > x)
        return false
    else return xReverse == x
}


fun main(args: Array<String>) {
    print(isPalindrome(1211))
}
