package nypc2023

fun getNearBracket(bracket: CharArray, i: Int): Int {
    var currency = i
    if (i >= bracket.size)
        return bracket.size - 1
    while (bracket[currency] == '0' && currency < bracket.size - 1) {
        currency++
    }
    return currency
}

fun isEmpty(bracket: CharArray):Boolean {
    for (i: Int in 0 until bracket.size - 1) {
        if (bracket[i] == '(' && bracket[getNearBracket(bracket, i + 1)] == ')')
            return true
    }
    return false
}

fun getBracketCount(bracket: String, n: Int): Int {
    var result = 0
    val modifiedBracket = bracket.toCharArray()
    while (isEmpty(modifiedBracket)) {
        for (i: Int in 0 until modifiedBracket.size - 1) {
            if (modifiedBracket[i] == '(' && modifiedBracket[getNearBracket(modifiedBracket, i + 1)] == ')') {
                result++
                modifiedBracket[i] = '0'
                modifiedBracket[getNearBracket(modifiedBracket, i + 1)] = '0'
            }
        }
    }
    modifiedBracket.forEach {
        if (it == '(')
            result += 2
    }
    return result
}


fun main() {
    val input = readLine()
    val n = input?.toIntOrNull()
    val bracket: String? = readlnOrNull()
    print(getBracketCount(bracket!!, n!!))
}