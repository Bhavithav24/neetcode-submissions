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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dum = new ListNode(0,head);
        ListNode pg = dum;
        ListNode ng;
        ListNode cur = head;
        ListNode prev;
        ListNode temp;
        while(pg.next != null){
            cur = pg.next;
            int c = 1;
            while(cur != null && c<k){
                c++;
                cur = cur.next;
            }
            if(cur == null) return dum.next;
            ng = cur.next;
            cur.next = null;
            prev = ng;
            ListNode kth = cur;
            cur = pg.next;
            while(cur != null){
                temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            temp = pg.next;
            pg.next = prev;
            pg = temp;
        }

        return dum.next;
    }
}
