import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 * 解题思路：
 * 1. 首先把1-26 对应的字母 存储在 map 映射结构中
 * 2. 循环时需要注意临界值和一般值的不同，
 *     比如 52->AZ； 52/26=2; 52%26=0； 当与26求模等于0时，列字母对应的是Z，（52/26）对应的是A
 * 
 * √ Your runtime beats 24.87 % of java submissions
 * √ Your memory usage beats 81.42 % of java submissions (33.8 MB)
 */
class Solution {
    public String convertToTitle(int n) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++)
            map.put(i + 1, (char) ('A' + i));

        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            if (n % 26 > 0) {
                sb.insert(0, map.get(n % 26));
                n = n / 26;
            } else {
                sb.insert(0, 'Z');
                n = n / 26 - 1;
            }
        }
        return sb.toString();
    }
}
