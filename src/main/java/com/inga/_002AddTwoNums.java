package com.inga;

/**
 * Created by abing on 2016-10-31.
 */
public class _002AddTwoNums {

    public static void main(String[] args) {
        ListNode t1 = new ListNode(3);
        ListNode t2 = new ListNode(7);
        ListNode t3 = new ListNode(4);
        ListNode t4 = new ListNode(9);

        ListNode l1 = new ListNode(9);
        l1.next = t1;
        l1.next.next = t2;

        ListNode l2 = new ListNode(9);
        l2.next = t4;
        l2.next.next = t3;

        ListNode ls = getAddListNode(l1 , l2);
        while (ls != null) {
            System.out.println(ls.val);
            ls = ls.next;
        }
    }

    public static ListNode getAddListNode(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode p = l1 , q = l2 , curr = dummy;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = (x+y+carry);
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0 ) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}

class ListNode{
    int val ;
    ListNode next;
    public  ListNode(int x){
        this.val = x;
    }
}
