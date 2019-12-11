import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为K的子数组
 * Your runtime beats 36.17 % of java submissions
 * Your memory usage beats 89.35 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                // 计算从nums[i]开始计算的数组和
                sum += nums[j];
                if (sum == k) { // 如果数组和等于k
                    // 则计数
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end
