/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 * 解题思路：
 * 一个数如果是2的幂，那么它最高位一定是1，其余位都是0
 * 
 * √ Your runtime beats 95.67 % of java submissions
 * √ Your memory usage beats 11.82 % of java submissions (34.5 MB)
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 0)
            return false;
        String binary = Integer.toBinaryString(n);
        int len = binary.length();
        for (int i = 0; i < (len - 1); i++) {
            if ((n & 1) != 0)
                return false;
            n = n >> 1;
        }
        return (n & 1) == 1;
    }
}
