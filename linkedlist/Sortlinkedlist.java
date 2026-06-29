
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode leftp=head;
        ListNode rightp=mid.next;
        mid.next=null;
        leftp=sortList(leftp);
        rightp=sortList(rightp);
        return mergelist(leftp,rightp);
    }
    private static ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }
    private static ListNode mergelist(ListNode leftp,ListNode rightp){
        ListNode dummiN=new ListNode(-1);
        ListNode temp=dummiN;
        ListNode t1=leftp;
        ListNode t2=rightp;
        while(t1!=null && t2!=null){
             if(t1.val<t2.val){
            temp.next=t1;
            temp=t1;
            t1=t1.next;
        }
        else{
            temp.next=t2;
            temp=t2;
            t2=t2.next;
        }

        }
        if(t1!=null){
            temp.next=t1;
        }
        else{
            temp.next=t2;
        }
        return dummiN.next;
    }

}
