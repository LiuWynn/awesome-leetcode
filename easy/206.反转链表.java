/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 * 解题思路：
 * 原本想着用递归来做，奈何手艺比不上脑速，能想但不能实现，所以就只能老老实实用循环了
 * 1. 如果给定链表有 0 个或 1 个元素，则直接返回链表头节点即可；
 * 2. 在循环中改变指针的方向，举例说明：1->2->3
 * 3. 我们首先申明一个变量，用于保存指针改变以后指向的节点，
 * 	  因为现在是反转链表，反转后每个节点指向的是其上一个节点，
 * 	  所以给这个变量命名为 pre，初始化为null
 * 4. 当前节点的 next 指向 pre
 * 5. 然后把 当前节点赋值给 pre，当前节点右移一位，pre 保存的就成了上一个节点
 * 6. 直到循环结束，返回 pre
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 46.42 % of java submissions (37 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 给定链表只包含0或1个节点时直接返回
        if (head == null || head.next == null)
            return head;
        // 用于保存指针改变以后指向的节点
        ListNode pre = null;
        while (head != null) {
            // 保存下一个节点的地址
            ListNode tmp = head.next;
            // 当前节点改变指针指向前一个节点
            head.next = pre;
            // 当前节点就变成了 上一个节点
            pre = head;
            // 把保存的下一个节点地址赋值给head以保证循环正常进行
            head = tmp;
        }
        return pre;
    }

}
