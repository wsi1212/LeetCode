fun isValid(s: String): Boolean {
    if (s == "") return true
    val s2 = s.replace("()","").replace("{}","").replace("[]","")
    if (s == s2) return false
    return isValid(s2)
}

fun main() {
    println(isValid("()"))
}
