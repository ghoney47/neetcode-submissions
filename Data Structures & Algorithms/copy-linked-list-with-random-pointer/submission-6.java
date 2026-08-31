/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;



        Node curr = head;
        HashMap<Node, Node> copyList = new HashMap<>();

        // first pass
        while (curr != null){
            copyList.put(curr, new Node(curr.val));
            curr = curr.next;         
        }

        curr = head;


        Node headCopy = copyList.get(head);
        Node copyCurr = copyList.get(head);
  

        while (curr != null){
            if (curr.next != null){
                copyCurr.next = copyList.get(curr.next);
            } else {
                copyCurr.next = null;
            }
            if (curr.random != null){
                copyCurr.random = copyList.get(curr.random);
            } else {
                copyCurr.random = null;
            }

            //System.out.println("The copy " + copyCurr.val + " points to " + copyCurr.next + " next and " + copyCurr.random);
            curr = curr.next;
            copyCurr = copyCurr.next;

            
        }

        return headCopy;
    }
}
