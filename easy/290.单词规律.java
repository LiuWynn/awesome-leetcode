import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 * 解题思路：
 * 用Map记录下每个pattern字母对应的字符串
 * 如果某个pattern字母存在且value与保存的不一致，则判定不合规律
 * 否则，合乎规律
 * 
 * √ Your runtime beats 79.35 % of java submissions
 * √ Your memory usage beats 35.25 % of java submissions (34.7 MB)
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        // 先把str转成str数组
        String[] strArr = str.split(" ");
        // 如果规则和字符串个数不同
        if (pattern.length() != strArr.length)
            return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < strArr.length; i++) {
            char key = pattern.charAt(i);
            if (!map.containsKey(key)) // 如果当前key不在map中
                map.put(key, strArr[i]); // 否则就把当前pattern对应字母和strArr对应字符串存入map
            else if (!strArr[i].equals(map.get(key)))
                return false;
        }
        // 一个小补丁
        // 可能会出现这种情况：pattern->abba; str->dog dog dog dog
        Map<String, Integer> pitchMap = new HashMap<String, Integer>();
        for (String s : map.values()) {
            if (pitchMap.containsKey(s)) {
                return false;
            } else {
                pitchMap.put(s, 1);
            }
        }
        return true;
    }
}