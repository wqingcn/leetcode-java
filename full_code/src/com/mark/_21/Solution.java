package com.mark._21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode p = l1;
        ListNode q = l2;
        ListNode merge = null;
        if(p.val <= q.val){
            merge = p;
            p = p.next;
        } else{
            merge = q;
            q = q.next;
        }
        ListNode curr = merge;
        while(p != null && q != null){
            if(p.val <= q.val){
                curr.next = p;
                curr = curr.next;
                p = p.next;
            } else {
                curr.next = q;
                curr = curr.next;
                q = q.next;
            }
        }
        if(p == null){
            curr.next = q;
        } else{
            curr.next = p;
        }
        return merge;
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
        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNode l1 = node1;
        ListNode l2 = node4;

        Solution solution = new Solution();
        ListNode merge = solution.mergeTwoLists(l1, l2);
        while(merge != null){
            System.out.print(merge.val);
            merge = merge.next;
        }

    }
}
