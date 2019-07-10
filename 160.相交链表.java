/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 * 解题思路：
 * 1. 首先循环获得两个链表的长度 lenA, lenB 和最后一个元素 A, B
 * 2. 如果元素 A, B不相等，则说明两个单链表不相交，返回 null
 * 2. 否则，lenDelta = | lenA - lenB|，长的那条链从 head 节点开始走 lenDelta 次，这样 两条链的后续节点等长
 * 3. 续上：此时，同步循环两条链，找到两条链上元素相等的第一个节点并返回
 * 
 * √ Your runtime beats 35.65 % of java submissions
 * √ Your memory usage beats 11.37 % of java submissions (47.7 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        for (int i = 0; i < Math.abs(lenA - lenB); i++) {
            if (lenA > lenB)
                headA = headA.next;
            else
                headB = headB.next;
        }

        // 此时 headA 和 headB 后续节点个数相同，因此只要选择其中一个作为循环结束条件即可
        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}

// class ListNode {
// int val;
// ListNode next;

// ListNode(int x) {
// val = x;
// next = null;
// }
// }
