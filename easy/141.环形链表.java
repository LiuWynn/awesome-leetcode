/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 * 解题思路：
 * 1. 使用两个指针（快慢指针），刚开始都指向链表头部
 * 2. 快指针一次跑两步，慢指针一次跑一步
 * 3. 如果有环，快慢指针一定会在环中相遇
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 75.64 % of java submissions (38.6 MB)
 */
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        // 排除一个元素和0个元素的情况
        if (head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
