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
        if(head==null || head.next==null)
        {
            return;
        }
        // Find middle 
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next !=null )
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the list from middle
        ListNode preMid = slow;
        ListNode preCurr = slow.next;
        while(preCurr.next != null)
        {
            ListNode curr = preCurr.next;
            preCurr.next = curr.next;
            curr.next = preMid.next;
            preMid.next = curr;
        }

        // Reorder both lists
        slow = head;
        fast = preMid.next;
        while(slow!=preMid)
        {
            preMid.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = preMid.next;
        }
    }
}