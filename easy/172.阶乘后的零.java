/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 * 解题思路：
 * 阶乘结果中的 0 的个数是由参与阶乘的数中包含多少个 2 和 5 决定的，
 * 2 和 5 个数的最小值就是阶乘后 0 的个数
 * 因为 5 的个数总是比 2 的个数小的，所以我们只要计算 参与阶乘的这些数中包含 5 的个数是多少就可以了
 * 
 * √ Your runtime beats 12.28 % of java submissions
 * √ Your memory usage beats 79.72 % of java submissions (33.9 MB)
 */
class Solution {
    public static int trailingZeroes(int n) {
        int five = 0;
        while (n > 0) {
            five += n / 5;
            n /= 5;
        }
        System.out.println("five: " + five);
        return five;
    }
}
