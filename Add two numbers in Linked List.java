class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head3 = new ListNode(-1);
        ListNode temp3 = head3;

        int carry = 0;
        while(temp1 != null || temp2 != null){
            int val1 = 0;
            if(temp1 != null){
                val1 = temp1.val;
                temp1 = temp1.next;
            }
            int val2 = 0;
            if(temp2 != null){
                val2 = temp2.val;
                temp2 = temp2.next;
            }
            int sum = val1 + val2 + carry;
            int base = sum % 10;
            carry = sum / 10;
            ListNode nn = new ListNode(base);
            temp3.next = nn;
            temp3 = nn;
        }
        if(carry != 0){
            ListNode nn = new ListNode(carry);
            temp3.next = nn;
        }
        head3 = head3.next;
        return head3;
    }
}
