/*
 * @lc app=leetcode.cn id=709 lang=java
 *
 * [709] 转换成小写字母
 * 
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 63.35 % of java submissions (34.1 MB)
 */
class Solution {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] += 32;
        }
        return new String(ch);
    }
}
