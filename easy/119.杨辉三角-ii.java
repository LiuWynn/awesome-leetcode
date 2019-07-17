import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 * 解题思路：参考杨辉三角，就是返回值改成单行
 * 
 * √ Your runtime beats 6.11 % of java submissions
 * √ Your memory usage beats 21.84 % of java submissions (34.6 MB)
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        // 存储杨辉三角
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        if (rowIndex == 0)
            return firstRow;

        for (int i = 1; i <= rowIndex; i++) { // 生成2 ~ rowIndex 行的数据
            List<Integer> currentRow = new ArrayList<>();
            for (int j = i; j > -1; j--) { // 某行数据具体的生成规则
                List<Integer> preRow = triangle.get(i - 1); // 拿到上一行的数据
                int left = (j - 1) < 0 ? 0 : preRow.get(j - 1);
                int right = j > (i - 1) ? 0 : preRow.get(j);
                currentRow.add(left + right);
            }
            triangle.add(currentRow);
        }
        return triangle.get(rowIndex);
    }
}
