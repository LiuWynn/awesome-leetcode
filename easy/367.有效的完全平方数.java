/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 * 解题思路：
 * 利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
 * 上面的思路可以，但是超时
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 11.05 % of java submissions (33.6 MB)
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        long mid = low + (high - low) / 2;
        while (low <= high) {
            if (mid * mid > num) {
                high = mid - 1;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else
                return true;
            mid = low + (high - low) / 2;
        }
        return false;
    }
}
