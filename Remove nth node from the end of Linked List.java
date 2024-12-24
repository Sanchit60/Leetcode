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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fp = head;
        ListNode sp = head;

        int i = 1;
        while(i <= n){
            fp = fp.next;
            i++;
        }
        if(fp == null){
            head = head.next;
            return head;
        }

        while(fp.next != null){
            sp = sp.next;
            fp = fp.next;
        }
        
        sp.next = sp.next.next;
        return head;
        
    }
}
