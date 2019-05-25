package com.bite.DS.Stack;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {
    private Object[] item;
    private int count;//栈中的元素个数
    private int size;//栈的大小

    public ArrayStack(int maxSize) {
        count = 0;
        this.size = maxSize;
        item = new Object[maxSize];
    }

    @Override
    public void push(E e) {
        if (count == size) {
            int newSize = size << 1;
            if (newSize + 8 > Integer.MAX_VALUE) {
                throw new IndexOutOfBoundsException("超出最大容量，扩容失败");
            }
            item = Arrays.copyOf(item, newSize);
            size = newSize;
        }
            item[count++] = e;

    }

    @Override
    public E pop() {
        if (isEmpty())
            return null;
        else {
            E e = (E) item[count - 1];
            item[count - 1] = null;
            --count;
            return e;
        }
    }

    @Override
    public E peek() {
        if (!isEmpty())
            return (E) item[count - 1];
        else
            return null;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(3);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
