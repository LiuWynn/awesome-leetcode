import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 * 
 * √ Your runtime beats 75.98 % of java submissions
 * √ Your memory usage beats 24.2 % of java submissions (34.3 MB)
 */
class Solution {
    public boolean isHappy(int n) {
        int[] nums = new int[] { 4, 16, 20, 37, 42, 58, 89, 145 };
        while (n != 1) {
            n = squareSum(n);
            if (Arrays.binarySearch(nums, n) > 0)
                return false;
        }
        return true;
    }

    public int squareSum(int n) {
        if (n < 10)
            return n * n;
        int sum = 0;
        while (n >= 10) {
            int t = n % 10;
            sum += t * t;
            n = n / 10;
        }
        sum += n * n;
        return sum;
    }
}
