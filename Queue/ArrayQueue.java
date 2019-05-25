package com.bite.DS.Queue;

import com.bite.DS.Stack.Stack;


public class ArrayQueue<E> implements Stack<E> {
    private Object[] item;
    private int head;//队列的头
    private int tail;//队列的尾
    private int capacity;//队列的容量

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        item = new Object[capacity];
    }

    @Override
    public void push(E e) {
        if (tail == capacity) {
            if(head==0){
                System.err.println("队列已满");
                throw new ArrayIndexOutOfBoundsException();
            }else {
                //数据搬移
                for (int i = head; i < tail; i++) {
                    item[i-head]=item[i];
                }
                //更新两指针
                tail-=head;
                head=0;
            }
        }
        item[tail++]=e;

    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        else {
            E e = (E) item[head];
            item[head] = null;
            head++;
            return e;
        }
    }

    @Override
    public E peek() {
        if (!isEmpty())
            return (E) item[head];
        else
            return null;
    }

    @Override
    public int getSize() {
        return tail - head;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer>queue=new ArrayQueue<>(5);
        System.out.println(queue.getSize());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());

    }
}
