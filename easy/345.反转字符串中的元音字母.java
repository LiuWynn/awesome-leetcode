import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 * 元音字母：a e i o u
 * 
 * √ Your runtime beats 58.76 % of java submissions
 * √ Your memory usage beats 44.56 % of java submissions (41.3 MB)
 */
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] chs = s.toCharArray();
        int i = 0, j = chs.length - 1; // 头尾指针
        while (i < j) {
            if (!vowels.contains(chs[i])) { // i指向的不是元音字母
                i++;
            }
            if (!vowels.contains(chs[j])) { // j指向的不是元音字母
                j--;
            }
            if (vowels.contains(chs[i]) && vowels.contains(chs[j])) { // i和j都指向元音字母
                char tmp = chs[i];
                chs[i] = chs[j];
                chs[j] = tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(chs);
    }
}
