/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 * 解题思路：
 * 把第一个字符和最后一个交换
 * 第二个字符和倒数第二个交换
 * 以此类推，交换 s.length / 2 次
 * 
 * √ Your runtime beats 78.31 % of java submissions
 * √ Your memory usage beats 33.7 % of java submissions (58.6 MB)
 */
class Solution {
    public void reverseString(char[] s) {
        int len = s.length / 2;
        for (int i = 0; i < len; i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}
