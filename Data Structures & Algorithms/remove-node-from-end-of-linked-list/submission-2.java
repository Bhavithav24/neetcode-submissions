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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //reverse the list.
        //traversal ll while counting.
        if(head == null || head.next == null){
            return null;
        }
        ListNode cur = head;
        int c = 1;
        while(cur != null){
            c++;
            cur = cur.next;
        }

        n = c - n;
        if(n == 1) return head.next;
        c = 1;
        ListNode prev = head;
        while(c < n - 1){
            c++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
        /*
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        int c = 1;
        head = prev;
        cur = prev;
        prev = null;
        while(cur != null){
            if(c == n){
                if(prev == null){
                    head = head.next;
                }
                else prev.next = cur.next;
                return head;
            }
            prev = cur;
            cur = cur.next;
            c++;
        }

        //if u reverse ull get the ans.
        return head;
        */
    }
}
