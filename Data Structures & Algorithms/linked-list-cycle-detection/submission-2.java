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
        if (head == null)
            return false;

        HashMap<ListNode, Integer> visited = new HashMap<>();

        visited.put(head, head.val);

        ListNode curr = head.next;

        while (curr != null){
            if (!visited.containsKey(curr)){
                visited.put(curr, curr.val);
                curr = curr.next;
            } else {
                return true;
            }
        }

        return false;

    }
}
