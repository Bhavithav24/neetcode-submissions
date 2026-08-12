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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Stack<Integer> st = new Stack<>();
        ListNode cur = slow.next;
        slow.next = null;
        while(cur != null){
            st.push(cur.val);
            cur = cur.next;
        }

        cur = head;
        while(!st.isEmpty()){
            ListNode node = new ListNode(st.pop());
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        
    }
}
