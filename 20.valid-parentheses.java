import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.17%)
 * Total Accepted:    552.4K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        // 这里用数据结构栈来做最为适宜
        // 1. 将输入字符串转化成字符数组
        // 2. 将字符数组中的每个字符顺序放入栈中，具体操作如下：
        //  2.1 字符数组中字符在放入栈之前，先和栈顶元素进行校验
        //  2.2 如果是匹配的，如() [] {}，则栈顶元素出栈，字符数组下标后移
        //  2.3 如果不匹配，则将此字符压栈
        //  2.4 重复2.1-2.3操作，直到字符数组下标后移到末尾
        // 3. 判断栈是否为空
        //  3.1 若栈为空，则返回true，说明括号匹配
        //  3.2 若栈不为空，则返回false，说明括号不匹配
        char[] parentheses = s.toCharArray(); // 转化成字符数组
        Stack<Character> stack = new Stack<>();
        stack.push('A'); // 栈中先放个元素，防止空栈报错
        int length = parentheses.length; // 字符串长度
        for (int i = 0; i < length; i++) { // 循环遍历字符串
            char ch = parentheses[i];
            char peek = stack.peek();
            if ((ch == ')' && peek == '(') || (ch == ']' && peek == '[') || (ch == '}' && peek == '{')) {
                stack.pop(); // 出栈
            } else {
                stack.push(ch);  // 压栈
            }
        }
        if (stack.peek() == 'A')
            return true;
        return false;
    }
}
