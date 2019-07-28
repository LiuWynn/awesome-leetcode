import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 * 
 * √ Your runtime beats 37.06 % of java submissions
 * √ Your memory usage beats 70.9 % of java submissions (40.9 MB)
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int subLen = 0; // 子串长度
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int posA = 0; // 记录子串初始位置
        int posB = 0; // 记录子串终止位置
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) { // 当前字符如果已经包含在集合中，说明子串重复了，改变索引到当前位置
                int tmp = posA;
                // 子串初始位置和终止位置重定位
                posA = map.get(s.charAt(i)) + 1;
                // 清空 posA 前面的集合
                for (int j = tmp; j < posA; j++) {
                    map.remove(s.charAt(j));
                }
            }
            // 添加当前位置元素
            map.put(s.charAt(i), i);
            // 子串终止位置重定位
            posB = i;
            // 记录最长子串
            subLen = (posB - posA + 1) > subLen ? (posB - posA + 1) : subLen;
        }
        return subLen;
    }
}
