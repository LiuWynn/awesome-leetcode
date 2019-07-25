import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 * 
 * √ Your runtime beats 37.7 % of java submissions
 * √ Your memory usage beats 19.87 % of java submissions (52.7 MB)
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n))
                return true;
            else
                map.put(n, 1);
        }
        return false;
    }
}
