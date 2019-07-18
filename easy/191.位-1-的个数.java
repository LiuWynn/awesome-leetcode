/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 * 
 * √ Your runtime beats 69.71 % of java submissions
 * √ Your memory usage beats 16.41 % of java submissions (34 MB)
 */
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0; // 记录位1的个数
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) // n 的最低位与 1 做 与运算，即 最低位 == 1，count+!
                count++;
            n = n >> 1; // 每次循环，整体右移一位
        }
        return count;
    }
}
