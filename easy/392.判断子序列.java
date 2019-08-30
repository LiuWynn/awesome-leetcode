/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 * 
 * √ Your runtime beats 35.17 % of java submissions
 * √ Your memory usage beats 82.81 % of java submissions (50.6 MB)
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length())
            return false;
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            // 在s没有遍历到末尾的时候，t已经到末尾了
            if (pos == t.length())
                return false;
            for (int j = pos; j < t.length(); j++) {
                char tCh = t.charAt(j);
                if (sCh == tCh) {
                    pos = j + 1;
                    break;
                }
                // 如果遍历到t的末尾且sCh和tCh不相等则返回false
                if ((j + 1 == t.length() && sCh != tCh))
                    return false;
            }
        }
        return true;
    }
}
