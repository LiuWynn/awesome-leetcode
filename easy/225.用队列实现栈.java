import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 * 
 * √ Your runtime beats 5.1 % of java submissions
 * √ Your memory usage beats 61.1 % of java submissions (34.4 MB)
 */
class MyStack {
    /*
     * 队列方法说明： add         增加一个元索                     
     * 如果队列已满，则抛出一个IIIegaISlabEepeplian异常 remove   移除并返回队列头部的元素    
     * 如果队列为空，则抛出一个NoSuchElementException异常 element  返回队列头部的元素             
     * 如果队列为空，则抛出一个NoSuchElementException异常
     * offer       添加一个元素并返回true        如果队列已满，则返回false
     * poll         移除并返问队列头部的元素     如果队列为空，则返回null
     * peek       返回队列头部的元素              如果队列为空，则返回null
     * put         添加一个元素                       如果队列满，则阻塞 take       
     * 移除并返回队列头部的元素    
     */
    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        // 将队列前面的元素放置后面
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
