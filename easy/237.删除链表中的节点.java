/*
 * @lc app=leetcode.cn id=237 lang=java
 *
 * [237] 删除链表中的节点
 * 解题思路：
 * 这题有点意思，平常见到的都是给头节点head和要删除节点node
 * 这题就仅是给了要删除节点，但其携带了链表的一部分结构信息
 * 
 * √ Your runtime beats 82.52 % of java submissions
 * √ Your memory usage beats 43.58 % of java submissions (36.9 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 先替换要删除节点的val值
        node.val = node.next.val; // 因为题目申明这不是最后一个节点
        // 在删除node后面的一个节点
        node.next = node.next.next;
    }
}
