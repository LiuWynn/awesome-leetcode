/*
 * @lc app=leetcode.cn id=918 lang=java
 *
 * [918] 环形子数组的最大和
 * 本题使用蛮力法（暴力法）会有[Time Limit Exceeded]异常
 * 思路：环形子数组最大和 = max(数组和-子数组最小和, 子数组最大和)
 * 解析：环形子数组的最大和可能会在两种情况下：无越界/越界
 * 1. 当环形子数组的最大和在无越界情况下取到时，此时情况等同于非环形子数组的最大和；
 * 2. 当环形子数组的最大和在越界情况下取到时，此时想直接求环形子数组最大和有点困难，
 *    但我们应知道，此时环形子数组的最小和一定在无越界情况下可以取到，
 *    这样，用数组和-环形子数组最小和即可。
 */

// @lc code=start
class Solution {

    public int maxSubarraySumCircular(int[] A) {
        // 求整个数组的和
        int sum = sum(A);
        int minSum = minSubarraySum(A);
        int maxSum = maxSubarraySum(A);
        return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
    }

    /**
     * 求数组中最大子数组的和
     */
    private static int maxSubarraySum(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int value : A) {
            max = Math.max(max, sum + value);
            if (sum + value > 0) {
                // 继续加
                sum += value;
            } else {
                // 更换最小数组起始下标位置
                sum = 0;
            }
        }
        return max;
    }

    /**
     * 求数组中最小子数组和（期望为负数）
     *
     * @param A 数组
     * @return 最小子数组和
     */
    private static int minSubarraySum(int[] A) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int value : A) {
            min = Math.min(min, sum + value);
            if (sum + value < 0) {
                // 继续加
                sum += value;
            } else {
                // 更换最小数组起始下标位置
                sum = 0;
            }
        }
        return min;
    }

    /**
     * 求数组和
     * 
     * @param A
     * @return
     */
    private static int sum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        return sum;
    }
}
// @lc code=end