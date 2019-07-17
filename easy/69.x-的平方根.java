/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 * 解题思路：因为题目让求出平方根整数部分，这样简单很多
 * 1. 遍历循环 0~Integer.MAX_VALUE，计算出当前循环数 i 的平方值 square
 * 2. 比较 平方值 square 和 给定数 x 的大小
 *  2.1 如果 square > x，则 x 的平方根就是 i-1，然后跳出循环
 *  2.2 否则，就继续循环
 * 3. 返回结果
 * 
 * √ Your runtime beats 31.12 % of java submissions
 * √ Your memory usage beats 96.84 % of java submissions (32.5 MB)
 */
class Solution {
    public int mySqrt(int x) {
        long square = 0L;
        long i = 0L;
        for (i = 0; i < Integer.MAX_VALUE; i++) {
            square = i * i;
            if (Long.compare(square, x) > 0)
                break;
        }
        return (int) i - 1;
    }
}
