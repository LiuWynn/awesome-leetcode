/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x,) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        int copyX = x; // 保存x
        long reverseX = 0;
        while ((copyX / 10) != 0) {
            reverseX = reverseX * 10 + (copyX % 10) * 10;
            copyX = copyX / 10;
        }
        reverseX += copyX;
        return (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) ? 0 : (int) reverseX;
    }
}
