/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 * 
 * √ Your runtime beats 28.1 % of java submissions
 * √ Your memory usage beats 51.35 % of java submissions (33.5 MB)
 */
class Solution {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return fib(N - 1) + fib(N - 2);
    }
}
