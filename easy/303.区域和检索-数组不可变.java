/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 * 解题思路：
 * 题目里提到了会多次调用sumRange()方法，
 * 所以每次都逐个相加计算子区间的和不是理想的做法。
 * 可以先使用sun[i]保存第0~i元素的和，
 * 则可以得到i~j子区间的和为sum[j]-sum[i]
 * 
 * √ Your runtime beats 39.49 % of java submissions
 * √ Your memory usage beats 74.73 % of java submissions (44.4 MB)
 */
class NumArray {
    private int[] sum;

    public NumArray(int[] nums) {
        this.sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            this.sum[i + 1] = this.sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return this.sum[j + 1] - this.sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */
