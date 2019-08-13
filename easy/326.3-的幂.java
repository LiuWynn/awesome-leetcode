/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 * 3的n次方,个位数为3、9、7、1这4个数中之一,且是9的倍数（当n>1时）
 * 
 * √ Your runtime beats 41.78 % of java submissions
 * √ Your memory usage beats 13.86 % of java submissions (40.5 MB)
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        // if (n <= 0)
        // return false;
        // if (n == 1 || n == 3)
        // return true;
        // int g = n % 10; // 个位数
        // return ((g == 1) || (g == 3) || (g == 7) || (g == 9)) && (n % 9 == 0);
        double a = Math.log(n) / Math.log(3);
        return Math.abs(a - Math.rint(a)) <= 0.00000000000001;
    }
}
