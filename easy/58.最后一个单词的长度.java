/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 * 解题思路：
 * 1. 先判断字符串是否为空，因为根据题意，是有可能出现空字符串的
 * 2. 去除形如：" a  "这类的字符串前后的空格，这里使用了 Java 官方的 trim() 函数
 * 3. 使用 Java 官方的 lastIndexOf() 方法，查找最后一个单词前空格的下标，这里会出现两种情况：
 *  3.1 有可能字符串中就包含一个单词，使用 lastIndexOf() 方法查询不到空格，此时返回值是 -1，此时 s 就是我们要找的最后一个单词；
 *  3.2 如果返回值不是 -1，则说明查询到了最后一个单词前的空格，此时使用 subString() 方法截取最后一个单词
 * 4. 获取到最后一个单词后，调用 length() 方法，然后返回单词长度， over!
 * 
 * √ Your runtime beats 97.21 % of java submissions
 * √ Your memory usage beats 96.39 % of java submissions (34.3 MB)
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;
        // 去除如："a "这样字符串最后的空格
        s = s.trim();
        int sIndex = s.lastIndexOf(" ");
        String lastWord;
        if (sIndex == -1) { // 只有一个单词
            lastWord = s;
        } else {
            lastWord = s.substring(sIndex + 1);
        }
        return lastWord.length();
    }
}
