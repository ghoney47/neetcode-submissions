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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;


        ListNode curr1 = list1;
        ListNode curr2 = list2;

        ListNode output = new ListNode(-5);
        ListNode currOut = output;

       


        while (curr1 != null || curr2 != null){
            //System.out.println("curr1: " + curr1.val + ", curr2: " + curr2.val);
            //null checking
            if (curr1 == null){
                currOut.next = curr2;
                break;
            } else if (curr2 == null){
                currOut.next = curr1;
                break;
            //value comparison
            } else if(curr1.val <= curr2.val){
                currOut.next = curr1;
                curr1 = curr1.next;
            } else {
                currOut.next = curr2;
                curr2 = curr2.next;
            }


            //updating currOut pointer
            currOut = currOut.next;
        }

        output = output.next;

        return output;
    }
}