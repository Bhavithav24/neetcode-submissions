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
        
        ListNode cur = head;
        int c = 1;
        while(cur != null){
            c++;
            cur = cur.next;
        }

        n = c - n;
        c = 1;

        cur = head;
        ListNode prev = null;
        while(cur != null){
            if(c == n){
                if(prev == null) head = cur.next;
                else prev.next = cur.next;
                return head;
            }c++;
            prev = cur;
            cur = cur.next;
        }

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
