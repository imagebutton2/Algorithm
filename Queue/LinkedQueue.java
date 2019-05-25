package com.bite.DS.Queue;

import com.bite.DS.Stack.Stack;

public class LinkedQueue<E> implements Stack<E> {
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
            tail.next=newNode;
            tail=tail.next;
        }
        size++;

    }

    @Override
    public E pop() {
        E value = null;
        if (!isEmpty()) {
            value=head.e;
            head.e=null;
            head=head.next;
            size--;
        }
        return value;
    }

    @Override
    public E peek() {
        if (!isEmpty())
            return head.e;
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
      LinkedQueue<Integer>queue=new LinkedQueue<>();
        System.out.println(queue.size);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
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