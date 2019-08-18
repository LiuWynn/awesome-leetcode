import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 * 
 * √ Your runtime beats 39.33 % of java submissions
 * √ Your memory usage beats 22.83 % of java submissions (38 MB)
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 记录nums1中各个元素及其出现次数
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // 记录交集
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n1 : nums1) {
            if (map.containsKey(n1))
                map.put(n1, map.get(n1) + 1);
            else
                map.put(n1, 1);
        }
        for (int n2 : nums2) {
            if (map.containsKey(n2) && map.get(n2) > 0) {
                list.add(n2);
                map.put(n2, map.get(n2) - 1);
            }
        }
        int[] res = new int[list.size()];
        int k = 0;
        for (int n : list) {
            res[k++] = n;
        }
        return res;
    }
}