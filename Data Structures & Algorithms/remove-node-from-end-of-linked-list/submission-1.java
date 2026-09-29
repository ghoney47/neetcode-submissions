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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            // we have two pointer solution st the right and left are n spaces away from each other
            // and we move the right pointer to the end of the list so that the left pointer becomes
            // the nth element from the end of the list


        // dummy node to build from 
        ListNode temp = new ListNode(0, head);
        ListNode left = temp;
        ListNode right = head;

        // move right pointer n steps forward
        for (int i = 0; i < n; i++){
            right = right.next;
        }

        // move both the left and right pointers forward until right is at the end
        while (right != null){
            left = left.next;
            right = right.next;
        }

        // once the right is at the end of the list 

        left.next = left.next.next;

        return temp.next;
        
    }
}
