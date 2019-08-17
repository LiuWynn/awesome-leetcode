import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 * 
 * √ Your runtime beats 81.79 % of java submissions
 * √ Your memory usage beats 35.2 % of java submissions (37.4 MB)
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int n1 : nums1)
            set.add(n1);
        for (int n2 : nums2) {
            if (set.contains(n2))
                res.add(n2);
        }
        int[] sec = new int[res.size()];
        Iterator<Integer> iterator = res.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            sec[k] = iterator.next();
            k++;
        }
        return sec;
    }
}
