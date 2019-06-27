/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 * 
 * √ Your runtime beats 94.83 % of java submissions
 * √ Your memory usage beats 87.48 % of java submissions (36 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 准备一个单链表，用来接收合并的链表数据
        ListNode mergeList = new ListNode(0); // 用单链表构造方法创建一个单链表类，这个不能修改，以记录头节点
        ListNode temp = mergeList; // 这是实际用来链接合并链表的单链表
        while (l1 != null && l2 != null) { // 两个单链表只要有一个遍历结束，则循环结束，剩下的那个链表则指向合并链表后面
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next; // 合并链表后移一位
        }
        temp.next = l1 != null ? l1 : l2;
        return mergeList.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
