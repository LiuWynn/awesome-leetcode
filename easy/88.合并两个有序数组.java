/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 * 解题思路：
 * 1. 给定的是有序数组，且两个数组长度已知
 * 2. 可以用两个指针，分别指向两数组的末尾，循环过程中，比较末尾指针指向的元素大小，将大的那个数放到num1数组的 m+n-i 位置
 * 3. 同时，指向大的那个数的指针--
 * 
 * √ Your runtime beats 98.52 % of java submissions
 * √ Your memory usage beats 76.29 % of java submissions (36.4 MB)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m;
        int n2 = n;
        for (int i = 0; i < (m + n) && n1 > 0 && n2 > 0; i++) {
            if (nums1[n1 - 1] > nums2[n2 - 1]) {// nums1的末尾非零数大于 nums2末尾的数
                nums1[m + n - 1 - i] = nums1[n1 - 1]; // 将大的那个值放到 nums1 数组的最右边
                n1--;
            } else {
                nums1[m + n - 1 - i] = nums2[n2 - 1];
                n2--;
            }
        }
        // 如果nums1指针到了0,此时需要将nums2剩下的元素赋值到nums1对应的位置
        for (int j = 0; j < n2 && n1 == 0; j++) {
            nums1[j] = nums2[j];
        }
    }
}
