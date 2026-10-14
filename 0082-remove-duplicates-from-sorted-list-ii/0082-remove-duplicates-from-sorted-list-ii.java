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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        while(curr!=null)
        {
            if(curr.next != null &&  curr.val == curr.next.val)
            {
                while(curr.next != null &&  curr.val == curr.next.val)
                {
                    curr = curr.next;
                }

                // skip the duplicate nodes directaly assign the prev node's next to curr's next 
                prev.next = curr.next;
            }
            else
            {
                // we find an unique node 
                prev = prev.next;
            }

                // then after skipping the move to next node
                 curr = curr.next;
            }

             return dummy.next;
        }
       
        
    }
