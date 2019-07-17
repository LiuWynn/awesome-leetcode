import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 * 
 * √ Your runtime beats 99.39 % of java submissions
 * √ Your memory usage beats 26.34 % of java submissions (33.9 MB)
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows != 0) {
            List<Integer> firstRow = new ArrayList<Integer>();
            firstRow.add(1);
            triangle.add(firstRow);
        }
        for (int i = 1; i < numRows; i++) { // 循环生成 2~numRows 行
            List<Integer> currentRow = new ArrayList<Integer>(); // 存储当前行的元素
            for (int j = i; j > -1; j--) { // 当前是第 i 行
                // 1. 获取上一行链表
                List<Integer> preRow = triangle.get(i - 1);
                // 2. 获取当前数 左上方的数
                int left = (j - 1) < 0 ? 0 : preRow.get(j - 1); // 如果左上方数的下标小于0，则补0
                // 3. 获取当前数 右上方的数
                int right = j > (i - 1) ? 0 : preRow.get(j); // 如果右上方的数的下标大于上一行最后一个数的下标，则补0
                currentRow.add(left + right);
            }
            triangle.add(currentRow);
        }
        return triangle;
    }
}
