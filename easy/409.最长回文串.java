import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 * 
 * √ Your runtime beats 14.91 % of java submissions
 * √ Your memory usage beats 80.56 % of java submissions (35.8 MB)
 */
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // 如果已存在
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // 计算最长回文串长度
        int length = 0;
        int plusOne = 0;
        for (int val : map.values()) {
            // 偶数的话肯定回文，奇数n的话有n-1个回文
            length += val % 2 == 0 ? val : val - 1;
            // 如果有一个字符是单数，则加一
            plusOne = val % 2 != 0 ? 1 : plusOne;
        }
        return length + plusOne;
    }
}
