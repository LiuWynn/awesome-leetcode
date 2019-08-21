/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 * 解题思路：
 * magazine="aabbccddeeff"
 * ransomNote="abcdef"
 * ransomNote中每个字符都在magazine存在且在不同位置，则return true
 * 
 * √ Your runtime beats 55.74 % of java submissions
 * √ Your memory usage beats 79.1 % of java submissions (45.7 MB)
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuffer sb = new StringBuffer(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = sb.indexOf(String.valueOf(ransomNote.charAt(i)));
            if (index != -1) // 查找到了
                sb.deleteCharAt(index);
            else
                return false;
        }
        return true;
    }
}
