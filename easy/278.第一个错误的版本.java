/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 * 
 * √ Your runtime beats 41.33 % of java submissions
 * √ Your memory usage beats 67.59 % of java submissions (33.8 MB)
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(1))
            return 1;
        int low = 1;
        int high = n;
        while (low < high) {
            int middle = low + (high - low) / 2 + 1; // 防止溢出 (low+high)/2
            if (isBadVersion(middle)) { // 如果是错误版本
                high = middle - 1;
            } else { // 如果不是错误版本
                low = middle;
            }
        }
        return high + 1;
    }
}
