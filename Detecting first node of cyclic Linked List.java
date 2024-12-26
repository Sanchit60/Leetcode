public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;
        boolean flag = false;

        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
            if(fp == sp){
                flag = true;
                break;
            }
        }
        if(flag == false){
            return null;
        }
        ListNode temp1 = head;
        ListNode temp2 = fp;
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
        
    }
}
