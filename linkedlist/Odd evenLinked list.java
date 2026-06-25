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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
         ListNode first=head;
        ListNode newhead=head.next;
        ListNode k=head.next;
        while(k!=null && k.next!=null){
          first.next=first.next.next;
            k.next=k.next.next;
          first=first.next;
          k=k.next;
        }
        first.next=newhead;
      return head;  
    }
}
