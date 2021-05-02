package com.ds.commons;

/**
 * @param <U>
 */
public class Node<U>{
    Node<U> next;
    U data;

    public Node(U data) {
        this.data = data;
    }

    public Node<U> getNext() {
        return next;
    }

    public void setNext(Node<U> next) {
        this.next = next;
    }

    public U getData() {
        return data;
    }

    public void setData(U data) {
        this.data = data;
    }
}
