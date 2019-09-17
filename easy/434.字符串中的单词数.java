/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 71.52 % of java submissions (34 MB)
 */
class Solution {
    public int countSegments(String s) {
        int segmentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ')
                segmentCount++;
        }
        return segmentCount;
    }
}
