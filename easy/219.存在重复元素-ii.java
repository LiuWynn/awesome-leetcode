import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 * 
 * √ Your runtime beats 93.42 % of java submissions
 * √ Your memory usage beats 70.36 % of java submissions (43.9 MB)
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) { // 已经包含 nums[i] 并且 重复元素下标相差<=k
                return true;
            } else { // 未包含 nums[i] 或者 包含了nums[i] 但是重复元素下标相差>k
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
