/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 * 解题思路：
 * 1. 设置快慢指针，快指针寻找不为0的数，慢指针指向为0的数
 * 2. 把快指针指向的数赋值给慢指针指向的数，然后快指针指向的数归零并继续寻找下去
 * 
 * √ Your runtime beats 94.65 % of java submissions
 * √ Your memory usage beats 51.52 % of java submissions (40.8 MB)
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) { // fast指向的不等于0
                // fast指向的数赋值给slow指向的数
                nums[slow] = nums[fast];
                if (slow != fast) // 如果二者指向的不是同一个数，则把fast指向的数归零
                    nums[fast] = 0;
                fast++;
                slow++;
            } else
                fast++;
        }
    }
}
