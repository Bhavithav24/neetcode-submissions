/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        int pos = 0;
        ListNode last = new ListNode(1);
        while(l1 != null || l2 != null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            ListNode node = new ListNode(val1 + val2 + pos);
            if(node.val/10 == 1){
                pos = 1;
                node.val %= 10;
            }else{
                pos = 0;
            }
            prev.next = node;
            prev = node;
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }

        if(pos == 1){
            
            prev.next = last;
        }
            

        return dummy.next;
    }
}
