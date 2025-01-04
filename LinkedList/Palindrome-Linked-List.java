class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fp = head;
        ListNode sp = head;
        while(fp.next != null && fp.next.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        ListNode head2 = sp.next;
        sp.next = null;
        head2 = reverseLL(head2);
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return true;        
    }

    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
