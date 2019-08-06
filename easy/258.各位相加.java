/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 * 
 * √ Your runtime beats 77.86 % of java submissions
 * √ Your memory usage beats 11.84 % of java submissions (34.6 MB)
 */
class Solution {
    public int addDigits(int num) {
        while (num > 9) { // 如果是两位数就一直循环
            int n = num;
            num = 0;
            while (n > 0) {
                num += n % 10;
                n /= 10;
            }
        }
        return num;
    }
}
