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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode temp = head;
        HashMap<ListNode, Integer> map = new HashMap<>();
        int c = 0;

        while(temp.next != null && !map.containsKey(temp.next)){
            map.put(temp, c);
            temp = temp.next;
            c++;
        }

    return map.containsKey(temp.next);
    }
}
