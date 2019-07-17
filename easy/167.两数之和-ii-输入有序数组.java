import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 * 解题思路：
 * 1. 循环遍历数组中每个元素
 * 2. 使用 map 结构来存储中间数据，结构如下：<target-numbers[i], i>
 * 3. 如果 map 的 key 包含 numbers[i]， 则返回数组 [map.get(numbers[i])+1, i+1]
 * 4. 否则，将 <target-numbers[i], i> 存储到 map 结构中
 * 
 * √ Your runtime beats 25.99 % of java submissions
 * √ Your memory usage beats 19.84 % of java submissions (39 MB)
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i]))
                return new int[] { map.get(numbers[i]) + 1, i + 1 };
            else
                map.put(target - numbers[i], i);
        }
        return null;
    }
}
