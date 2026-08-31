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
    if (head == null || head.next == null) return;

    ListNode currNode = head;
    int len = 1;
    while (currNode.next != null) {
        currNode = currNode.next;
        len++;
    }
    currNode = head;

    // advance to the last node of the first half
    for (int i = 0; i < (len - 1) / 2; i++) {
        currNode = currNode.next;
    }

    // split into two lists
    ListNode secondHalf = currNode.next;
    currNode.next = null;

    // reverse the second half
    ListNode prev = null, curr = secondHalf;
    while (curr != null) {
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }

    // merge
    ListNode first = head, second = prev;
    while (second != null) {
        ListNode firstNext = first.next;
        ListNode secondNext = second.next;

        first.next = second;
        if (firstNext != null) second.next = firstNext;

        first = firstNext;
        second = secondNext;
    }
}
}
