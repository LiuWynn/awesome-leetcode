/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 * 
 * √ Your runtime beats 93.06 % of java submissions
 * √ Your memory usage beats 63.62 % of java submissions (43.8 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode preNode = head;
        ListNode curNode = head.next;
        // 先忽略第一个节点是否等于 val
        while (curNode != null) {
            if (curNode.val == val) { // 找到了需要删除的节点
                // 将前指针指向后一个节点
                preNode.next = curNode.next;
                // 当前指向位置后移，不然会陷入死循环
                curNode = curNode.next;
            } else {
                preNode = preNode.next;
                curNode = curNode.next;
            }

        }
        // 检查第一个元素
        if (head.val == val)
            head = head.next;
        return head;
    }
}
