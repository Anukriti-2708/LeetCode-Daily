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
    public ListNode middleNode(ListNode head) {
          ListNode slow =  head;
          
          ListNode fast = head;
        
        while(fast.next!=null){
            if (fast.next.next == null){
                head = slow.next;
                return head;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        head = slow;
        return head;
    }
}
