import java.util.Stack;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 * 原先思路：
 * 遍历链表，将链表元素保存在栈和队列中，
 * 遍历结束，知道了链表的元素个数，然后就可以再次循环（元素个数的一半）
 * 比对栈和队列的元素是否相同，不同返回false,直至循环结束未返回false,则返回true
 * 缺点：浪费了 n 个空间，n表示链表元素个数
 * 
 * 新思路：
 * 遍历链表，设置快慢指针，慢指针走1步，快指针走2步，
 * 当快指针到链表结尾，慢指针差不多是到链表中间，期间用栈保存链表前半部分
 * 在链表后半部分的循环中，比较栈中元素和慢指针指向元素是否相同
 * 不同则直接返回false，相同返回true
 * 缺点：仍然需要使用 n/2 个空间
 * 
 * √ Your runtime beats 31.13 % of java submissions
 * √ Your memory usage beats 52.11 % of java submissions (44.3 MB)
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head; // 快指针，没事走两步
        ListNode slow = head; // 慢指针，正常走一步
        Stack<Integer> stack = new Stack<Integer>(); // 保存链表前半部分（即慢指针经过的元素）
        while (fast != null) {
            stack.add(slow.val);
            // 防止链表长度是奇数的情况下，fast指针为空
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = null;
                stack.pop();
            }
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != stack.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }
}
