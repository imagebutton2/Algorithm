package com.bite.DS.Stack;

public class LinkedStack<E> implements Stack<E> {
    private int size = 0;
    private Node head;
    private Node tail;

    private class Node {
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }
    }

    @Override
    public void push(E e) {
        Node newNode = new Node(e, null);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = tail;
            tail = newNode;
        }
        size++;

    }

    @Override
    public E pop() {
        E value = null;
        if (!isEmpty()) {
            value = tail.e;
            tail.e = null;
            tail = tail.next;
            size--;
        }
        return value;
    }

    @Override
    public E peek() {
        if (!isEmpty())
            return tail.e;
        else
            return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}