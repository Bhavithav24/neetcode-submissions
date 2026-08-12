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
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        //store all values in list.
        ListNode temp = head;
        if(head == null) return head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        //list.add(temp.val);
        //retrive all list values in rev ,create a node and add in linked list.
        ListNode reshead = new ListNode();
        
        for(int i = list.size() - 1; i >= 0; i--){
            ListNode node = new ListNode(list.get(i));
            if(reshead == null){
                reshead = node;
                continue;
            }
            ListNode t = reshead;
            while(t.next != null){
                t = t.next;
            }
            t.next = node;
        }

        return reshead.next;
    }
}
