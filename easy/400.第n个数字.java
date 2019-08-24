/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第N个数字
 * 1位数字：1~9
 * 2位数字：10~99
 * 3位数字：100~999
 * 抽象：9*10^(i-1)*i,i代表位数
 * 
 * √ Your runtime beats 5.33 % of java submissions
 * √ Your memory usage beats 64.14 % of java submissions (34.3 MB)
 */
class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        int comp = 9 * 1 * 1; // 与n的比较值，来确定n对应的数字位数i
        // 确定n对应的数的位数,比如n=20，对应的数位数是2
        while (n > comp) {
            digit++;
            comp += 9 * Math.pow(10, digit - 1) * digit;
        }
        // 确定n对应的数在i位数中是第几个，比如n=20，在位数是2的数中排20-9=11
        for (int i = 1; i < digit; i++) {
            n -= 9 * Math.pow(10, i - 1) * i;
        }
        int reminder = n % digit;
        int nth = n / digit;
        // 如果余数不为0，nth要+1才是真正的位置，比如n=20，(20-9)/2=5,其实是第6个数字
        if (reminder != 0)
            nth++;
        // 确定n对应的是什么数
        int num = (int) Math.pow(10, digit - 1);
        for (int j = 0; j < nth - 1; j++)
            num++;
        // 找到第n个数字
        /**
         * n=20,num=15,digit=2,reminder=1
         */
        if (reminder != 0)
            num /= Math.pow(10, digit - reminder);
        return num % 10;
    }
}
