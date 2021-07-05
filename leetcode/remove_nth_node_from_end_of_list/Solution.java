package leetcode.remove_nth_node_from_end_of_list;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode cur = head;
        while(count<n){
            cur=cur.next;
            count+=1;
        }
        if(cur==null){
            return head.next;
        }
        ListNode slow = head;
        while(cur.next!=null){
            cur=cur.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
        
    }
}