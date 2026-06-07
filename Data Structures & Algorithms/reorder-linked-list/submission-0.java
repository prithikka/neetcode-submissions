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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ListNode tail=head;
        ListNode prev=null;
        while(tail.next!=null){
        temp=tail.next;
        while(temp.next!=null){
          prev=temp;
          temp=temp.next;
        }
        temp.next=tail.next;
        tail.next=temp;
        tail=tail.next.next;
        prev.next=null;
        }
        return;
    }
}
