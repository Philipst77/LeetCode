package LinkedList.JavaSolutions;

public class AddTwoNumbers{
    class ListNode{
        int val =0;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val =val;

        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next =next;
        } 
    }


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current= dummy;
        ListNode current1 = l1;
        ListNode current2 = l2;
        int carry =0;

        while(current1 != null || current2 != null || carry !=0  ){


            int res1 = (current1 != null)? current1.val:0;
            int res2 = (current2 !=null)? current2.val:0;
            
            int sum = res1+res2+carry;

            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            
            if(current1 != null) current1= current1.next;
            if(current2 != null)current2= current2.next;

        }
        return dummy.next;

    }
}
}