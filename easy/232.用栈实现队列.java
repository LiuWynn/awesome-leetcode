import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 * 解题思路：
 * 两个栈，一个负责接收输入push，一个负责输出pop/peek
 * 
 * √ Your runtime beats 60.33 % of java submissions
 * √ Your memory usage beats 45.13 % of java submissions (34.4 MB)
 */
class MyQueue {
    Stack<Integer> output;
    Stack<Integer> input;

    /** Initialize your data structure here. */
    public MyQueue() {
        output = new Stack<Integer>();
        input = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        transfer();
        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        transfer();
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }

    public void transfer() {
        // 如果输出栈为空
        if (output.isEmpty()) {
            // 则把输入栈的元素全部取出放到输出栈准备输出（此时输出栈元素出栈顺序与“逻辑队列”出对顺序相同）
            while (!input.isEmpty())
                output.add(input.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */