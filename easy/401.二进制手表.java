/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 * Integer.bitCount(i)：计算i中二进制形式下1的个数
 * 
 * √ Your runtime beats 92.32 % of java submissions
 * √ Your memory usage beats 76.36 % of java submissions (35.5 MB)
 */
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> s = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            // 1的个数表示小时位亮灯数
            int h = Integer.bitCount(i);
            if (h > num)
                continue;
            for (int j = 0; j < 60; j++) {
                // 1的个数表示分钟位亮灯数
                int m = Integer.bitCount(j);
                // h和m的个数如果等于手表亮灯数
                if (h + m == num)
                    s.add(Integer.toString(i) + ":" + (j < 10 ? "0" + Integer.toString(j) : Integer.toString(j)));
            }
        }
        return s;
    }
}
