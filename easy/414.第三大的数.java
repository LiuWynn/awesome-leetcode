/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 * 
 * √ Your runtime beats 78.45 % of java submissions
 * √ Your memory usage beats 61.33 % of java submissions (38.5 MB)
 */
class Solution {
    public int thirdMax(int[] nums) {
        int first, sec, third;
        first = sec = third = Integer.MIN_VALUE;
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE && flag) {
                count++;
                flag = false;
            }

            if (nums[i] > first) { // 当前数比最大值大
                // 保存最大值
                int tmp1 = first;
                // 当前值给最大值
                first = nums[i];
                // 保存第二大的值
                int tmp2 = sec;
                // 之前的最大值转交给第二大值
                sec = tmp1;
                // 之前的第二大值转交给第三大值
                third = tmp2;
                count++;
            } else if (nums[i] > sec && nums[i] != first) {
                // 保存第二大值
                int tmp = sec;
                // 当前值给第二大值
                sec = nums[i];
                // 之前的第二大值转交给第三大值
                third = tmp;
                count++;
            } else if (nums[i] > third && nums[i] != first && nums[i] != sec) {
                // 当前值给第三大值
                third = nums[i];
                count++;
            }
        }
        return count >= 3 ? third : first;
    }
}
