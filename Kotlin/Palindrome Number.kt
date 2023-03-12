fun isPanlindrome (_ s: String) -> Bool {
    if s == String(s.reversed( )) {
        return true
    } else {
        return false
    }
    print (isPanlindrome ("기러기 ") )