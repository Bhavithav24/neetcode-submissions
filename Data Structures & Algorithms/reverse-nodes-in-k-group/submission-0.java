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
        ListNode cur = head;
        ListNode nh = null;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }

        ListNode t1 = null;
        ListNode t2 = null;
        ListNode prev = null;
        cur = head;
        while (len > 0){
            if (len < k){
                t2.next = cur;
                return nh;
            }
            prev = null;
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    t1 = t2;
                    t2 = cur;
                }
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            if (nh == null) {
                nh = prev;
            } else {
                t1.next = prev;
            }
            len -= k;
        }
        return nh;
    }
}

/* trail fail.
ListNode cur = head;
int len = 0;
while(cur != null){
    cur = cur.next;
    len++;
}

ListNode t1 = null;
ListNode t2 = null;
ListNode prev = null;
cur = head;
int c = 0;

while(true){
    if(len - c <= k){
        if(c % k == 0){
            t1 = t2;
            t2 = cur;
            prev = null;
        }
        else if((c + 1) % k == 0){
            if(t1 != null){
                t1.next = cur;
                t1 = t2;
                t2 = cur;
            }
            else head = cur;
        }

        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
        c++;
    }
    else{
        if(t1 != null) t1.next = cur;
        break;
    }
}

return head;



**for single split or only two groups.

ListNode cur = head;
ListNode tail = head;
ListNode prev = null;
int len = 0;
while(cur != null){
    cur = cur.next;
    len++;
}
cur = head;
int c = 1;
while(cur != null){
    if(k == c++){
        head = cur;
    }
    ListNode temp = cur.next;
    cur.next = prev;
    prev = cur;
    cur = temp;
    if(k == c-1){
        prev = null;
        if(len-k < k) break;
    }

}

if(len-k < k){
    prev = cur;
}
tail.next = prev;

return head;
*/
