import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 * 解题思路：
 * 1. 将给定的整型数组先传给 ArrayList<Integer> list 变量
 * 2. 倒序循环列表 list，在 list 列表末尾 +1 ，得到结果放回原位
 * 3. 若 结果 == 0，则要向前一位进1
 * 4. 重复 步骤3 直到列表循环结束
 * 
 * √ Your runtime beats 6.63 % of java submissions
 * √ Your memory usage beats 58 % of java submissions (34.7 MB)
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length; // 给定数组的长度
        ArrayList<Integer> list = new ArrayList<>(); // 介于之后数组长度可能会发生变化，所以先把数组元素存到 list
        for (int digit : digits)
            list.add(digit);
        for (int i = (len - 1); i >= 0; i--) {
            if (i == (len - 1)) // 只有最低位，才会在刚开始的时候+1
                list.set(i, list.get(i) + 1);
            if (i != 0 && list.get(i) == 10) { // 自身清零，前一位进1
                list.set(i, 0);
                list.set(i - 1, digits[i - 1] + 1);
            }
            if (i == 0 && list.get(i) == 10) {
                list.set(0, 0); // 第0位变为0
                list.add(0, 1); // 前面增加一位，1
            }
        }
        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++)
            result[i] = list.get(i);
        return result;
    }
}
