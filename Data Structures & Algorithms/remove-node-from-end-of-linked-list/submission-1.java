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
        ListNode tail=head;
        ListNode prev=null;
        
        while(tail!=null)
        tail=tail.next;

        for(int i=n;i>0;i--){
            ListNode temp=head;
            while(temp.next!=tail){
              prev=temp;
              temp=temp.next;
            }
            tail=temp;
            if(tail==head){
            head=head.next;
            return head;
            }
        }
        prev.next=tail.next;
    return head;
    }
}
