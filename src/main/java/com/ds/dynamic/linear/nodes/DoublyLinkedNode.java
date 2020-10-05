package com.ds.dynamic.linear.nodes;

public class DoublyLinkedNode<T> {
    public DoublyLinkedNode<T> last;
    public T value;
    public DoublyLinkedNode<T> next;
    public DoublyLinkedNode(T value) {
        this.value = value;
    }
}