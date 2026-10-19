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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;

        while(curr!=null)
        {
            ListNode run = curr;
            int sum = 0;
            while(run.val>0)
            {
                sum += run.val;
                run = run.next;
            }

            curr.val = sum;
            curr.next = run.next;
            curr = run.next;
        }
        return head.next;
        
    }
}