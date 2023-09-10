//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}
//
//fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//    var result: ListNode
//    var l1Len = if (l1 == null) 0 else 1
//    var l2Len = if(l2 == null) 0 else 1
//    var l1Current = l1
//    var l2Current = l2
//    while (l1Current?.next != null) {
//        l1Len ++
//        l1Current = l1Current?.next
//    }
//    while (l2Current?.next != null) {
//        l2Len ++
//        l2Current = l2Current?.next
//    }
//    l1Current = l1
//    l2Current = l2
//    while (l1Current != null || l2Current != null) {
//
//    }
//
//
//    return result
//}
//
//fun main() {
//    var t1 = ListNode(2)
//    t1.next = ListNode(4)
//    t1.next?.next = ListNode(3)
//    var t2 = ListNode(5)
//    t2.next = ListNode(6)
//    t2.next?.next = ListNode(4)
//    print(addTwoNumbers(t1, t2))
//}
