package leetcode.add_two_numbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur=head;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int x=l1!=null? l1.val:0;
            int y=l2!=null?l2.val:0;
            int val= (x+y+carry);
            carry=val/10;
            cur.next=new ListNode(val%10);
            cur=cur.next;
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
        }
        return head.next;
    }
}