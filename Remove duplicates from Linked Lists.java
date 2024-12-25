class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp2 != null){
            if(temp1.val == temp2.val){
                temp2 = temp2.next;
            } else{
                temp1.next = temp2;
                temp1 = temp2;
            }
        }
        temp1.next = temp2;
        return head;

        
        
    }
}
