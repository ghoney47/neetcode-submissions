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
        //empty case
        if(head == null)
            return head;


        //base case we have reached the end of the list
        if (head.next == null){
            return head;
        }

        //recursive case
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return curr;

        
    }
}
