package com.mark._876;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        Solution solution = new Solution();
        ListNode middle = solution.middleNode(node1);
        while(middle != null){
            System.out.print(middle.val);
            middle = middle.next;
        }

    }
}
