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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode temp = head;
        while( temp != null)
        {
            lst.add(temp.val);
            temp = temp.next;
        }

        int[] ans = new int[lst.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < lst.size(); i++) {

            while (!stack.isEmpty() && lst.get(i) > lst.get(stack.peek())) {
                ans[stack.pop()] = lst.get(i);
            }

            stack.push(i);
        }
        return ans;
    }
}