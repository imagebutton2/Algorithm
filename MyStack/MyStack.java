//队列实现栈
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> in;
    Queue<Integer> out;
    int size = 0;

    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {

        if (in.peek() != null) {
            in.offer(x);
        } else if (out.peek() != null) {
            out.offer(x);
        } else {
            //都为空，则用queue1开始
            in.offer(x);
        }
        size++;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (empty()) {
            throw new RuntimeException("无数据");
        }
        int e = 0;
        if (out.peek() != null) {
            for (int i = 0; i < size - 1; i++) {
                in.offer(out.poll());
            }
            e = out.poll();
        } else {
            for (int i = 0; i < size - 1; i++) {
                out.offer(in.poll());
            }
            e = in.poll();
        }
        this.size--;
        return e;
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (empty()) {
            throw new RuntimeException("无数据");
        }
        int e = 0;
        if (out.peek() != null) {
            for (int i = 0; i < size; i++) {
                e = out.poll();
                in.offer(e);
            }
        } else {
            for (int i = 0; i < size; i++) {
                e = in.poll();
                out.offer(e);
            }
        }
        return e;

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }
}


