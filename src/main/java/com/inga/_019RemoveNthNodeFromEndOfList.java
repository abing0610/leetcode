package com.inga;


/**
 * Created by abing on 2016-11-21.
 */
public class _019RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node1.next.next = node3;
        node1.next.next.next = node4;
        node1.next.next.next.next = node5;

        ListNode now = removeNode(node1 , 7);
        System.out.println(now.i);
        while (now.next != null){
            now = now.next;
            System.out.println(now.i);
        }

    }

    public  static  ListNode removeNode(ListNode node , int n){

        for (int i=0;i < n ;i++){
            node = node.next;
        }

        return node;
    }



    static class  ListNode{
        int i;
        ListNode next;
        public ListNode(int i){
            this.i = i;
        }
    }
}
