class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;

        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp;
               
    }
}
