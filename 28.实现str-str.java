/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 * 
 * √ Your runtime beats 51.26 % of java submissions
 * √ Your memory usage beats 83.45 % of java submissions (36.2 MB)
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2)
            return -1;
        if (l2 == 0)
            return 0;
        if (l1 == 0)
            return -1;
        for (int i = 0; i < l1; i++) {
            if (i + l2 > l1)
                return -1;
            for (int j = 0;; j++) {
                if (j == l2)
                    return i;
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }
        return -1;
    }
}
