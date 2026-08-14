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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            if(cur.val == val){
                if(prev == null){
                    head = cur.next;
                    cur = cur.next;
                    continue;
                }
                prev.next = cur.next;
            }
            else prev = cur;
            cur = temp;
        }
        return head;
    }
}