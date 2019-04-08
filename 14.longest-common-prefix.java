/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.21%)
 * Total Accepted:    435.6K
 * Total Submissions: 1.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
class Solution {
    // ["flower","flow","flight"]
    public String longestCommonPrefix(String[] strs) {
        int strsLen = strs.length;  // 字符串数组的长度
        if (strs == null || strsLen == 0)
            return "";
        // 1. 计算出字符串数组中最短字符串的index
        // 2. 设最短字符串长度为min，循环min次
        // 3. 不断取出第一个字符串的字符与其他的字符串相应位置的字符进行比较
        //  3.1 若都相等，则进行下一次比较
        //  3.2 若不相等，则返回公共前缀
        int minIndex = getShortestStrIndex(strs);
        int minStrLen = strs[minIndex].length();  // 最短字符串的长度
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < minStrLen; i++) {  // 大循环下，取出每个 str 在 i 下标的字符
            char ch = strs[0].charAt(i); // 第一个字符串的第 i 个字符
            for (int j = 1; j < strsLen; j++) {  // 小循环，将每个 str 对应位置下的字符进行比较
                if (ch != strs[j].charAt(i))   // 不相等
                    return sb.toString();
            }
            // 相等
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int getShortestStrIndex(String[] strs) {
        int length = strs.length;
        if (length == 1)
            return 0;
        int minIndex = 0;
        int minLen = strs[0].length();
        for (int i = 1; i < length; i++) {
            if (strs[i].length() < minLen) {
                minIndex = i;
                minLen = strs[i].length();
            }
        }    
        return minIndex;
    }
}

