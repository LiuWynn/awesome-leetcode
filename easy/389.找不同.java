import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 * 
 * √ Your runtime beats 6.46 % of java submissions
 * √ Your memory usage beats 83.04 % of java submissions (35.6 MB)
 */
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j)) && map.get(t.charAt(j)) > 0)
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
            else
                return t.charAt(j);

        }
        return ' ';
    }
}
