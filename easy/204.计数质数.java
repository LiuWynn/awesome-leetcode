/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 * 解题思路：
 * 该算法在寻找素数时，采用了一种与众不同的方法：
 * 先将 2－N 的各数放入表中，然后在 2 的上面画一个圆圈，然后划去 2 的其他倍数；
 * 第一个既未画圈又没有被划去的数是 3，将它画圈，再划去 3 的其他倍数；
 * 现在既未画圈又没有被划去的第一个数是 5，将它画圈，并划去5的其他倍数……依次类推，一直到所有小于或等于N的各数都画了圈或划去为止。
 * 这时，表中画了圈的以及未划去的那些数正好就是小于 N 的素数。
 * 
 * √ Your runtime beats 28.02 % of java submissions
 * √ Your memory usage beats 30.35 % of java submissions (37.1 MB)
 */
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] flag = new boolean[n];
        for (int i = 2; i < n; i++)
            flag[i] = true;
        // 标记质数倍数的数为flag
        for (int i = 2; i * i < n; i++) {
            if (flag[i]) {
                for (int j = i * i; j < n; j += i) {
                    flag[j] = false;
                }
            }
        }
        // 统计 flag 数组中 true 的个数
        for (boolean f : flag)
            count += f ? 1 : 0;
        return count;
    }
    /*
     * public int countPrimes(int n) { if (n == 0 || n == 1) return 0; int count =
     * 0; for (int i = 2; i < n; i++) { if (isPrime(i)) count++; } return count; }
     */
    /**
     * 判断 正整数 n 是否是质数
     * 
     * @param n: n >= 2
     * @return
     */
    /*
     * public boolean isPrime(int n) { // 如果 n 是大于2的偶数，则肯定不是质数 if (n > 2 && n % 2 ==
     * 0) return false; for (int i = 2; i < n; i++) { // 判断 2 ~ n-1 之间是否存在其他因子 if (n
     * % i == 0) return false; } return true; }
     */
}
