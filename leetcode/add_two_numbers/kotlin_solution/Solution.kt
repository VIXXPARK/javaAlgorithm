class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ans: ListNode = ListNode(0)
        helper(l1, l2, ans, 0)
        return ans.next
    }

    fun helper(_l1: ListNode?, _l2: ListNode?, _cur: ListNode?, carry: Int) {
        var l1 = _l1
        var l2 = _l2
        var cur = _cur
        if (l1 == null && l2 == null && carry == 0) {
            return
        }
        var left = 0
        if (l1 != null)
            left = l1.`val`
        var right = 0
        if (l2 != null)
            right = l2.`val`
        var sum = left + right + carry
        cur?.next = ListNode(sum % 10)
        cur = cur?.next
        if (l1 != null) {
            l1 = l1.next
        } else {
            l1 = l1
        }
        if (l2 != null) {
            l2 = l2.next
        } else {
            l2 = l2
        }
        var carry = sum / 10
        helper(l1, l2, cur, carry)

    }


}