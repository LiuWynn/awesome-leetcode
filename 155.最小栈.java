import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 * 解题思路：按顺序存储的方式实现最小栈，当然你也可以选择随机存储的方式
 * 
 * √ Your runtime beats 7.21 % of java submissions
 * √ Your memory usage beats 11.06 % of java submissions (56.4 MB)
 */
class MinStack {
    /**
     * 用于存储栈中的元素
     */
    private int[] element;

    /**
     * 标识栈中最新入栈的元素下标+1
     */
    private int top;

    /** initialize your data structure here. */
    public MinStack() {
        element = new int[10];
        top = 0;
    }

    public void push(int x) {
        if (top == element.length) {
            // 栈满 扩容 增加 1 倍空间
            element = Arrays.copyOf(element, element.length * 2);
        }
        // element[top] = x;
        // top++;
        // 或者写成
        element[top++] = x;
    }

    public void pop() {
        if (top > 0)
            top--;
    }

    public int top() {
        return element[top - 1];
    }

    public int getMin() {
        if (element == null)
            return 0;
        int min = element[0];
        for (int i = 0; i < top; i++) {
            min = element[i] < min ? element[i] : min;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
