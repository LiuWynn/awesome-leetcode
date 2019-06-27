/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 * 
 * √ Your runtime beats 97.38 % of java submissions
 * √ Your memory usage beats 71.2 % of java submissions (44.6 MB)
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length; // 整型数组的长度
        if (len <= 1)
            return len;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1])
                nums[count++] = nums[i];
        }
        return count;
    }
}
