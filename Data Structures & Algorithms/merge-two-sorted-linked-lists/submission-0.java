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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode c3 = null;
        ListNode head = null;
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                ListNode node = new ListNode(c1.val);
                if(c3 == null){
                    head = node;
                    c3 = node;
                    c1 = c1.next;
                    continue;
                }
                c3.next = node;
                c3 = node;
                c1 = c1.next;
            }else{
                ListNode node = new ListNode(c2.val);
                if(c3 == null){
                    head = node;
                    c3 = node;
                    c2 = c2.next;
                    continue;
                }
                c3.next = node;
                c3 = node;
                c2 = c2.next;
            }
        }

        while(c1 != null){
            ListNode node = new ListNode(c1.val);
            if(c3 == null){
                head = node;
                c3 = node;
                c1 = c1.next;
                continue;
            }
            c3.next = node;
            c3 = node;
            c1 = c1.next;
        }

        while(c2 != null){
            ListNode node = new ListNode(c2.val);
            if(c3 == null){
                head = node;
                c3 = node;
                c2 = c2.next;
                continue;
            }
            c3.next = node;
            c3 = node;
            c2 = c2.next;
        }

        return head;
    }
}