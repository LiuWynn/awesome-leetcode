/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 * 
 * √ Your runtime beats 87.29 % of java submissions
 * √ Your memory usage beats 94.55 % of java submissions (39 MB)
 */
class Solution {
    public String intToRoman(int num) {
        if (num < 1 || num > 3999)
            return null;
        StringBuilder sb = new StringBuilder();
        // 千位数的处理
        int A1 = num / 1000;
        int A2 = num % 1000;
        for (int i = 0; i < A1; i++) {
            sb.append("M");
        }

        // 百位数的处理
        int B1 = A2 / 100;
        int B2 = A2 % 100;
        if (B1 == 4) {
            sb.append("CD");
        } else if (B1 == 9) {
            sb.append("CM");
        } else if (B1 == 5) {
            sb.append("D");
        } else if (B1 != 0) {
            if (B1 >= 6)
                sb.append("D");
            for (int i = 0; i < (B1 % 5); i++) {
                sb.append("C");
            }
        }

        // 十位数的处理
        int C1 = B2 / 10;
        int C2 = B2 % 10;
        if (C1 == 4) {
            sb.append("XL");
        } else if (C1 == 9) {
            sb.append("XC");
        } else if (C1 == 5) {
            sb.append("L");
        } else if (C1 != 0) {
            if (C1 >= 6)
                sb.append("L");
            for (int i = 0; i < (C1 % 5); i++) {
                sb.append("X");
            }
        }

        // 个位数的处理
        int D1 = C2;
        if (D1 == 4) {
            sb.append("IV");
        } else if (D1 == 9) {
            sb.append("IX");
        } else if (D1 == 5) {
            sb.append("V");
        } else if (D1 != 0) {
            if (D1 >= 6)
                sb.append("V");
            for (int i = 0; i < (D1 % 5); i++) {
                sb.append("I");
            }
        }
        return sb.toString();
    }
}
