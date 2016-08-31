package ar.fiuba.tdd.template;


public class NotEmptyNode<T> extends Node<T> {
    private T value;
    private Node<T> next = new EmptyNode<T>();

    public NotEmptyNode(T value) {
        this.value = value;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final T getData() {
        return this.value;
    }

    public final int size() {
        return 1 + this.next.size();
    }

    public final Node<T> insertData(T value) {
        next = next.insertData(value);
        return this;
    }

    public final Node<T> getNextNode() {
        return this.next;
    }
}
