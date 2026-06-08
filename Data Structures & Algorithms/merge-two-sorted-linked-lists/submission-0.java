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

        ListNode output;
        ListNode currOut;

        //setting output head
        if (curr1 == null){
            output = curr2;
            currOut = output;

            //updating curr2 pointer
            curr2 = curr2.next;
        } else if (curr2 == null){
            output = curr1;
            currOut = output;

            //updating curr1 pointer
            curr1 = curr1.next;
        } else if (curr1.val <= curr2.val) {
            output = curr1;
            currOut = output;

            //updating curr1 pointer
            curr1 = curr1.next;
        } else {
            output = curr2;
            currOut = output;

            //updating curr2 pointer
            curr2 = curr2.next;
        }


        while (curr1 != null || curr2 != null){
            //System.out.println("curr1: " + curr1.val + ", curr2: " + curr2.val);



            //null checking
            if (curr1 == null){
                currOut.next = curr2;
                if (curr2 != null){
                    curr2 = curr2.next;
                } else{
                    curr2 = null;
                }
            } else if (curr2 == null){
                currOut.next = curr1;
                if (curr1 != null){
                    curr1 = curr1.next;
                } else{
                    curr1 = null;
                }

            //value comparison
            } else if(curr1.val <= curr2.val){
                currOut.next = curr1;
                if (curr1 != null){
                    curr1 = curr1.next;
                } else{
                    curr1 = null;
                }
            } else {
                currOut.next = curr2;

                if (curr2 != null){
                    curr2 = curr2.next;
                } else{
                    curr2 = null;
                }
            }


            //updating currOut pointer
            currOut = currOut.next;
        }

        return output;
    }
}