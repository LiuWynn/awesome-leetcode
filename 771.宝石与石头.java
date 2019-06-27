/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 * 
 * √ Your runtime beats 99.61 % of java submissions
 * √ Your memory usage beats 92.43 % of java submissions (34.4 MB)
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null)
            return 0;
        int jLen = J.length();
        int sLen = S.length();
        int num = 0;
        for (int i = 0; i < jLen; i++) {
            for (int j = 0; j < sLen; j++) {
                if (J.charAt(i) == S.charAt(j))
                    num++;
            }
        }
        return num;
    }
}
