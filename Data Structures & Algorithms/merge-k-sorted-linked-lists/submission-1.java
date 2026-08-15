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
    public ListNode m(ListNode a, ListNode b) {
        
        ListNode head = null;
        ListNode temp =null;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                if (head == null) {
                    head = a;
                    temp = a;
                } else {
                    temp.next = a;
                    temp = a;
                }
                a = a.next;
            }else {
                if (head == null) {
                    head = b;
                    temp = b;
                } else {
                    temp.next = b;
                    temp = b;
                }
                b = b.next;
            }
        }
        if (a != null) {
            temp.next = a;
            temp = a;
            a = a.next;   
        }else{
            temp.next = b;
            temp = b;
            b = b.next;
        }
        return head;
    }
    public ListNode mm(ListNode[] lists, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            ListNode a = mm(lists, l, m);
            ListNode b = mm(lists, m + 1, r);
            lists[l] = m(a, b);
        }
        return lists[l];
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return mm(lists, 0, lists.length-1);
    }
}
