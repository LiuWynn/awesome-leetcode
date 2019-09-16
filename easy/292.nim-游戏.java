/*
 * @lc app=leetcode.cn id=292 lang=java
 *
 * [292] Nim 游戏
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 11.5 % of java submissions (34.2 MB)
 */
class Solution {
    public boolean canWinNim(int n) {
        if (n % 4 == 0)
            return false;
        return true;
    }
}
