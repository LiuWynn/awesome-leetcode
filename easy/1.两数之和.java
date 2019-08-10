import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // 1. 如果nums[i]不在map的key中，则将target-nums[i]存入map的key
            // 2. 如果nums[i]在map的key中，则返回{key对应的value，i}
            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };
            else
                map.put(target - nums[i], i);
        }
        return null;
    }
}
