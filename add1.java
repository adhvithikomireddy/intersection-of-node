class Solution {
    public ListNode addOne(ListNode head) {
       int carry=helper(head);
       if(carry==1){
        ListNode n=new ListNode(1);
        n.next=head;
        return n;
       }
       return head;
    }
    int helper(ListNode head){
        if(head==null){
            return 1;
        }
        int carry=helper(head.next);
         int sum=head.val+carry;
        head.val=sum%10;
        return sum/10;
    }
}