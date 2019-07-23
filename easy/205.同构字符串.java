import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 * 解题思路：例如：egg,add
 * 1. 可以先用 map 结构存储给定两个字符串上各字母的对应关系，e->a, g->d
 * 2. 然后遍历 egg 和 add 上各个字母，并根据 map 构造出 egg 和 add 的实际同构字符串
 * 3. 把实际同构字符串 与 给定同构字符串 进行比较
 * 4. 相同 返回 true
 * 5. 不同 返回 false
 * 
 * √ Your runtime beats 10.71 % of java submissions
 * √ Your memory usage beats 5.08 % of java submissions (47.8 MB)
 */
class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || s.length() == 0)
            return true;
        int len = s.length();
        // 记录 s -> t 上各字母的对应关系
        Map<Character, Character> mapS = new HashMap<>();
        // 记录 t -> s 上各字母的对应关系
        Map<Character, Character> mapT = new HashMap<>();
        // 结构字母映射关系
        for (int i = 0; i < len; i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (!mapS.containsKey(chS))
                mapS.put(chS, chT);
            if (!mapT.containsKey(chT))
                mapT.put(chT, chS);
        }
        // 构建实际的同构字符串
        StringBuffer sbS = new StringBuffer();
        StringBuffer sbT = new StringBuffer();
        for (int j = 0; j < len; j++) {
            sbS.append(mapS.get(s.charAt(j)));
            sbT.append(mapT.get(t.charAt(j)));
        }
        return sbS.toString().equals(t) && sbT.toString().equals(s);
    }
}
