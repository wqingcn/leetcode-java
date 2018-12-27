package com.mark._206;

class Solution {

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode p = head;
        ListNode q = p.next;
        while(q != null){
            p.next = pre;
            pre = p;
            p = q;
            q = q.next;
        }
        p.next = pre;
        return p;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Solution solution = new Solution();
        ListNode p = solution.reverseList(node1);
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}