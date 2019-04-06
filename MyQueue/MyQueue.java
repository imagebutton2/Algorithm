
//��ջʵ�ֶ���

import java.util.Stack;

public class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       peek();
       return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(out.empty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
    return in.empty()&&out.empty();
    }
}
