/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 * 解题思路：
 * 1. s和t长度不等，肯定不是异位词
 * 2. 用数组记录每个单词出现次数，s中字母出现一次+1，t中字母出现一次-1
 * 3. 最后数组中如果元素都为0，则给定字符串异位
 * 
 * √ Your runtime beats 36.95 % of java submissions
 * √ Your memory usage beats 51.49 % of java submissions (39.9 MB)
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        for (int j = 0; j < t.length(); j++) {
            alpha[t.charAt(j) - 'a']--;
            // 如果两字符串不是异位的，肯定存在某个字母被减少到<0
            if (alpha[t.charAt(j) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
