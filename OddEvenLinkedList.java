/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena=0;
        int lenb=0;
        ListNode temp=headA;
        while(temp!=null){
            lena++;
            temp=temp.next;
        }
           temp=headB;
        while(temp!=null){
            lenb++;
            temp=temp.next;
        }
        while(lena>lenb){
            headA=headA.next;
            lena--;
        }
         while(lena<lenb){
            headB=headB.next;
            lenb--;
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}