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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 1. Find the length of the list and the tail node
        ListNode tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // 2. Adjust k if it is greater than the length
        k = k % n;
        if (k == 0) {
            return head;
        }

        // 3. Connect the tail to the head to make it circular
        tail.next = head;

        // 4. Find the new tail: (n - k)th node
        ListNode newTail = head;
        for (int i = 0; i < n - k - 1; i++) {
            newTail = newTail.next;
        }

        // 5. The node after newTail is the new head, then break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        
        

        
    }
}