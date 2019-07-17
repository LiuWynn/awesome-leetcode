/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 * 本题难点在于对报数概念的理解，光看题目描述很难充分理解。
 * 我是到 leetcode 官方看了解答区的解释才大概了解了什么意思。
 * 题目里“按照其中的整数的顺序进行报数，得到下一个数”的意思，我们具体分析如下：
 * 数字 1 的报数就是 1
 * 数字 2 的报数：根据上一个报数得到，即 对数字 1 的报数进行报数得到 一个一，即 11
 * 数字 3 的报数：根据上一个报数得到，即 对数字 2 的报数进行报数得到 两个一，即 21
 * 数字 4 的报数：根据上一个报数得到，即 对数字 3 的报数进行报数得到 一个二，一个一，即 1211
 * 数字 5 的报数：根据上一个报数得到，即 对数字 4 的报数进行报数得到 一个一，一个二，两个一，即111221
 * 数字 6 的报数：根据上一个报数得到，即 对数字 5 的报数进行报数得到 三个一，两个二，一个一，即312211
 * √ Your runtime beats 38.76 % of java submissions
 * √ Your memory usage beats 75.58 % of java submissions (36.1 MB)
 */
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String say = "11";
        StringBuffer sb = new StringBuffer();
        for (int i = 2; i < n; i++) { // 用循环递推报数
            // sb 作为存储每次推导结果的容器，所以在循环开始需要清空一下
            int sb_len = sb.length();
            sb.delete(0, sb_len);
            int len = say.length(); // 为防止多次调用 length() 影响效率，故单独提取出来，算是小的优化（苦笑）
            int repeat = 0; // 标识数字重复出现的次数
            for (int j = 0; j < len; j++) {
                char current = say.charAt(j); // 比较位-当前字符
                char next; // 比较位-下一个字符
                if (j != len - 1)
                    next = say.charAt(j + 1);
                else
                    next = '0'; // 避免下标越界异常和空指针异常，需要给next 赋值，由题目可知，0 是不错的选择
                if (current == next) {
                    repeat++;
                } else {
                    sb.append(String.valueOf(repeat + 1) + current);
                    repeat = 0; // 每一次比较位变换，计数器都要归零
                }
            }
            say = sb.toString();
        }
        return say;
    }
}
