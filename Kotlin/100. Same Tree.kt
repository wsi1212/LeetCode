class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    return (p?.`val` == q?.`val`) && isSameTree(p?.left,q?.left) && isSameTree(p?.right, q?.right)
}

fun main() {
    var t1 = TreeNode(1)
    t1.left = TreeNode(2)
    t1.right = TreeNode(3)
    var t2 = TreeNode(1)
    t2.left = TreeNode(2)
    t2.right = TreeNode(3)
    print(isSameTree(t1,t2))
}