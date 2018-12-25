# 234. Palindrome Linked List
## Description
Given a singly linked list, determine if it is a palindrome.
### Example:
Example 1:
```
Input: 1->2
Output: false
```
Example 2:
```
Input: 1->2->2->1
Output: true
```
## 思路
使用快慢指针，慢指针每次移动一个元素，快指针每次移动两个元素。让快指针遍历整个链表，当快指针到达链尾时，慢指针处于链表中间。在慢指针遍历的同时，将链表前半部分反转。这时再将慢指针遍历至链尾与刚反转的前半部分链表进行对比，若每个元素都相同，则为回文链表。
## 完整代码
```
class Solution{
public:
    bool isPalindrome(ListNode* head){
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(fast.next != null && fast != null){
            fast = fast.next.next;
            ListNode curr = slow.next;
            slow.next = pre;
            pre = slow;
            slow = curr;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while(slow != null){
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
```