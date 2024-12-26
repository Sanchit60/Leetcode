public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(fp == sp){
                return true;
            }
        }
        return false;
        
    }
}
