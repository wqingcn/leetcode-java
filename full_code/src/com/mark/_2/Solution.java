

public class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while(p != null || q != null){

            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        ListNode  l1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        l1.next = node2;
        node2.next = node3;
        node3.next = null;

        l2.next = node5;
        node5.next = node6;
        node6.next = null;

        Solution solution = new Solution();
        ListNode l = solution.addTwoNumbers(l1, l2);
        while(l != null){
            System.out.print(l.val);
            l = l.next;
        }

    }
}
