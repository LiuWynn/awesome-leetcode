/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 * √ Your runtime beats 91.91 % of java submissions
 * √ Your memory usage beats 11.78 % of java submissions (34.6 MB)
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        // 把整型转成二进制形式字符串
        String binary = Integer.toBinaryString(num);
        /*
         * 1: 1 4: 100 16: 10000 64: 1000000 观察可知，4的幂最高为是1，其余位是0，且0的个数是偶数个
         */
        int len = binary.length() - 1;
        if ((len % 2) != 0) // 不是偶数个0
            return false;
        for (int i = 0; i < len; i++) {
            if ((num & 1) != 0)
                return false;
            num = num >> 1;
        }
        return (num & 1) == 1;
    }
}
