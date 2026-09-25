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
            
            ListNode kth = findkth(cur,k);
            if(kth == null) return dum.next;
            ng = kth.next;
            kth.next = null;
            
            prev = ng;
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

    public ListNode findkth(ListNode cur, int k){
        int c = 1;
            while(cur != null && c<k){
                c++;
                cur = cur.next;
            }
        return cur;
    }
}
