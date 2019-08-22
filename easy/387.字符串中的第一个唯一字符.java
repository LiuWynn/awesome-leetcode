/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 * 
 * √ Your runtime beats 30.58 % of java submissions
 * √ Your memory usage beats 33.32 % of java submissions (48.9 MB)
 */
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (i == j)
                    continue;
                else if (c == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }
}
