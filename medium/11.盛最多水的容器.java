/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 * 
 * √ Your runtime beats 5.06 % of java submissions
 * √ Your memory usage beats 64.49 % of java submissions (44.6 MB)
 */
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return area;
    }
}
