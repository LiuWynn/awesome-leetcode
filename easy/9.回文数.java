/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 * 
 * √ Your runtime beats 77.8 % of java submissions
 * √ Your memory usage beats 85.66 % of java submissions (38 MB)
 */
class Solution {

    public boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        // 1. 反转数字，参照[7]Reverse Integer
        // 2. 与原数字进行比较
        // 2.1 相等，返回true
        // 2.2 不等，返回false
        int copyX = x;
        int reverseX = 0;
        while ((copyX / 10) > 0) { // 根据数字大小给定循环次数
            reverseX = reverseX * 10 + (copyX % 10) * 10;
            copyX /= 10;
        }
        return (copyX + reverseX) == x;
    }

    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseX = 0;
        while (x > reverseX) {
            reverseX = reverseX * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 reverseX/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = reverseX = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == reverseX || x == reverseX / 10;
    }
}
