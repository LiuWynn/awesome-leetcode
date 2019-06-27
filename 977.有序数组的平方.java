import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 * 
 * √ Your runtime beats 63.29 % of java submissions
 * √ Your memory usage beats 48.16 % of java submissions (51.9 MB)
 */
class Solution {
    public int[] sortedSquares(int[] A) {
        if (A == null)
            return null;
        for (int i = 0; i < A.length; i++) {
            int tmp = A[i];
            A[i] = tmp * tmp;
        }
        Arrays.sort(A);
        return A;
    }
}
