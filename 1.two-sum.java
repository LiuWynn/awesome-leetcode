import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (42.99%)
 * Total Accepted:    1.6M
 * Total Submissions: 3.8M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // 1. 如果nums[i]不在map的value中，则将target-nums[i]存入map的value
            // 2. 如果nums[i]在map的value中，则返回{value对应的key, i}
            // 在第二步遇到了问题，改变map存储的顺序，key存target-nums[i]，value存i
            // ------------------------------------
            // 1. 如果nums[i]不在map的key中，则将target-nums[i]存入map的key
            // 2. 如果nums[i]在map的key中，则返回{key对应的value，i}
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            else
                map.put(target - nums[i], i);
        }
        return null;
    }
}

