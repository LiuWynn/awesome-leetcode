/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 *
 * https://leetcode.com/problems/roman-to-integer/description/
 *
 * algorithms
 * Easy (51.91%)
 * Total Accepted:    388.4K
 * Total Submissions: 748.1K
 * Testcase Example:  '"III"'
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, two is written as II in Roman numeral, just two one's added
 * together. Twelve is written as, XII, which is simply X + II. The number
 * twenty seven is written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making
 * four. The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * 
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * 
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be
 * within the range from 1 to 3999.
 * 
 * Example 1:
 * 
 * 
 * Input: "III"
 * Output: 3
 * 
 * Example 2:
 * 
 * 
 * Input: "IV"
 * Output: 4
 * 
 * Example 3:
 * 
 * 
 * Input: "IX"
 * Output: 9
 * 
 * Example 4:
 * 
 * 
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 */
class Solution {
    public int romanToInt(String s) {
        // 1. 对给定的罗马数字进行遍历
        // 2. 根据罗马数字和整数的对照表，进行转化
        // Symbol Value
        // I 1
        // V 5
        // X 10
        // L 50
        // C 100
        // D 500
        // M 1000
        // 3. 特别注意几个特殊情况：IV IX XL XC CD CM
        // I can be placed before V (5) and X (10) to make 4 and 9. 
        // X can be placed before L (50) and C (100) to make 40 and 90. 
        // C can be placed before D (500) and M (1000) to make 400 and 900.
        int length = s.length(); // 循环次数
        int num = 0; // 存储罗马数字转化成的整数
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i); // 获取单个字符
            char next;  // 获取当前字符的下一个字符
            if (i == length-1)  // i指向最后一个字符，next不存在
                next = 'A';
            else
                next = s.charAt(i+1);
            switch (ch) {
                case 'I':
                    if (next == 'V') {
                        num += 4; // IV = 4
                        i++;
                    } else if (next == 'X') {
                        num += 9; // IX = 9
                        i++;
                    } else {
                        num += 1; // I = 1
                    }
                    break;
                case 'V':
                    num += 5; // V = 5
                    break;
                case 'X':
                    if(next == 'L') {
                        num += 40; // XL = 40
                        i++;
                    } else if (next == 'C') {
                        num += 90; // XC = 90
                        i++;
                    } else {
                        num += 10; // X = 10
                    }
                    break;
                case 'L':
                    num += 50; // L = 50
                    break;
                case 'C':
                    if (next == 'D') {
                        num += 400; // CD = 400
                        i++;
                    } else if (next == 'M') {
                        num += 900; // CM = 900
                        i++;
                    } else {
                        num += 100; // C = 100
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}
