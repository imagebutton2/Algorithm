package com.bite.DS.Queue;

public interface Queue<E> {
    void push(E e);
    E pop();
    E peek();
    int getSize();
    boolean isEmpty();
}
