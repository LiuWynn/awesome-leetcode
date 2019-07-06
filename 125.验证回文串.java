/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 * 解题思路：
 * 1. 循环 回文串长度/2 次
 * 2. 在循环中找到回文串 左右字符 对应的下标
 * 3. 如果左右字符不是字母或数字 则 左边的下标右移，或者右边的下标左移
 * 4. 如果移动到的左右两个比较位字符不相同（忽略大小写），则 return false; 否则 return true
 * 
 * √ Your runtime beats 49.12 % of java submissions
 * √ Your memory usage beats 47.47 % of java submissions (39.6 MB)
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int newLen = s.length() / 2;
        s = s.toLowerCase(); // 先转小写
        int left = 0; // 记录左边比较位的下标
        int right = s.length() - 1; // 记录右边比较位的下标
        char lc = s.charAt(left); // 左边比较位对应字符
        char rc = s.charAt(right); // 右边比较位对应字符
        for (int i = 0; i < newLen; i++) {
            if (!isValid(lc))
                lc = s.charAt(++left);
            if (!isValid(rc))
                rc = s.charAt(--right);
            if (isValid(lc) && isValid(rc)) {
                if (lc != rc)
                    return false;
                else {
                    lc = left >= s.length() - 1 ? ' ' : s.charAt(++left);
                    rc = right <= 0 ? ' ' : s.charAt(--right);
                }
            }
        }
        return true;
    }

    /**
     * 判断字符是否是字母或数字
     */
    public boolean isValid(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            return true;
        return false;
    }
}
