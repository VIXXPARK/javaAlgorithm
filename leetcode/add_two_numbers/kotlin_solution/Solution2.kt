class Solution2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ll1 = l1
        var ll2 = l2
        var res = ListNode(0)
        var dummyHead = res
        var sum = 0

        while (ll1 != null || ll2 != null) {
            sum /= 10

            if (ll1 != null) {
                sum += ll1.`val`
                ll1 = ll1.next
            }

            if (ll2 != null) {
                sum += ll2.`val`
                ll2 = ll2.next
            }

            res.next = ListNode(sum % 10)
            res = res.next
        }

        if (sum / 10 != 0) res.next = ListNode(sum / 10)
        return dummyHead.next
    }
}