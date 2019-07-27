/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 * 解题思路：
 * 1. 循环两个链表，从左向右开始相加（逆序）
 * 2. 若当前位两链表都有值，则把两数相加满10进1
 * 3. 若当前位两链表其一无值，则把有值链表和0相加
 * 4. 若当前位两链表均无值，则循环结束，返回结果
 * 
 * √ Your runtime beats 37.4 % of java submissions
 * √ Your memory usage beats 89.84 % of java submissions (43 MB)
 * 
 * 改进：
 * 循环前的代码显得冗余，这样做虽然是为了能返回头节点，但达到这个目的还有更好的方法
 * 例如：可以让 head 指向第一个节点，最后返回 head.next 即可
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 先计算第一个节点的情况
        int a = l1 != null ? l1.val : 0;
        int b = l2 != null ? l2.val : 0;
        int carry = 0;
        // 给相加和的第一个节点赋值
        ListNode sum = new ListNode((a + b) % 10);
        // 有进位时 carry 设置为1
        carry = (a + b) > 9 ? 1 : 0;
        ListNode result = sum;
        // 链表当前位右移
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        while (l1 != null || l2 != null || carry == 1) {
            // 得到当前节点的 val
            a = l1 != null ? l1.val : 0;
            b = l2 != null ? l2.val : 0;
            // 链表当前位右移
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if ((a + b + carry) > 9) { // 有进位
                sum.next = new ListNode((a + b + carry) % 10);
                carry = 1;
            } else { // 无进位
                sum.next = new ListNode((a + b + carry) % 10);
                carry = 0;
            }
            sum = sum.next;
        }
        return result;
    }
}
