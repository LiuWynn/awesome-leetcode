import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 * 解题思路：这题非常简单，看代码应该就能看懂
 * 
 * √ Your runtime beats 5 % of java submissions
 * √ Your memory usage beats 5.03 % of java submissions (37.8 MB)
 */
class Solution {
    public int titleToNumber(String s) {
        if (s == null)
            return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++)
            map.put((char) ('A' + i), i + 1);
        int len = s.length();
        int num = 0;
        for (int k = 0; k < len; k++) {
            int no = map.get(s.charAt(k));
            num += no * Math.pow(26, len - k - 1);
        }
        return num;
    }
}
