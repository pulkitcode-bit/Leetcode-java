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
    public static ListNode reversed(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;       
        }
    return prev;
    }

    public boolean isPalindrome(ListNode head) {
        //find middle node using tortoise and hare approach  slow will be the middle 
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the  node you get new node  head
        ListNode newhead = reversed(slow.next);
        //now check the list node value are equl till you find that second become null
        ListNode first = head;
        ListNode second = newhead;
        while (second != null) {
            if (first.val != second.val) {
                reversed(newhead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reversed(newhead);
        return true;
    }
}
