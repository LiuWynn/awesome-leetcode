/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 * √ Your runtime beats 98.59 % of java submissions
 * √ Your memory usage beats 12.26 % of java submissions (34.2 MB)
 */
class Solution {
    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        boolean flag = true; // 判断给定数字是否满足丑数条件，默认是满足的
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                flag = false;
            }
            if (!flag)
                return false;
        }
        return true;
    }
}
