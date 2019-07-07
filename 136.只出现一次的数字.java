import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 * 
 * √ Your runtime beats 17.23 % of java submissions
 * √ Your memory usage beats 5.05 % of java submissions (44.5 MB)
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, 2);
            else
                map.put(num, 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return 0;
    }
}
