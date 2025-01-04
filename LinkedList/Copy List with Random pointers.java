class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node curr = head;

        //We are creating copied nodes at the next of original nodes.

        while(curr != null){
            Node copiedN = new Node(curr.val);
            Node Next = curr.next;
            curr.next = copiedN;
            copiedN.next = Next;
            curr = curr.next.next;
        }
        // Establishinh the random connections for copied Nodes
        curr = head;
        while(curr != null){
            Node copiedN = curr.next;
            Node originalRn = curr.random;
            if(originalRn == null){
                copiedN.random = null;
            } else{
                copiedN.random = originalRn.next;
            }
            curr = curr.next.next;
        }
        //Disconnecting the copied LL from the original LL
        curr = head;
        Node headC = curr.next;
        while(curr != null){
            Node cn = curr.next;
            curr.next = cn.next;
            if(curr.next == null){
                cn.next = null;
            }else{
                cn.next = curr.next.next
            }
            curr = curr.next;
        }       
        return headC;
    }
}
