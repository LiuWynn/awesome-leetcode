/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
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
            char next; // 获取当前字符的下一个字符
            if (i == length - 1) // i指向最后一个字符，next不存在
                next = 'A';
            else
                next = s.charAt(i + 1);
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
                if (next == 'L') {
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
