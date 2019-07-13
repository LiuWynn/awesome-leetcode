import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 * 解题思路：
 * 1. 遍历给定数组，保存数组中各个元素出现的次数
 * 2. 遍历保存的 map结构，返回出现次数 > n/2 的元素
 * 
 * √ Your runtime beats 18.05 % of java submissions
 * √ Your memory usage beats 27.21 % of java submissions (50.4 MB)
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > (nums.length / 2))
                return key;
        }
        return 0;
    }
}
