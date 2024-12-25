public class Solution {
    public int getSize(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = getSize(headA);
        int s2 = getSize(headB);
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(s1 > s2){
            int diff = s1 - s2;
            while(diff >= 1){
                temp1 = temp1.next;
                diff--;
            }
        } else {
            int diff = s2 - s1;
            while(diff >= 1){
                temp2 = temp2.next;
                diff--;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;


        
    }
}
