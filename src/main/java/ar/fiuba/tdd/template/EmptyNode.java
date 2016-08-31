package ar.fiuba.tdd.template;


public class EmptyNode<T> extends Node<T> {

    public boolean isEmpty() {
        return true;
    }

    public final T getData() {
        throw new AssertionError();
    }

    public final int size() {
        return 0;
    }

    public final Node<T> insertData(T value) {
        return new NotEmptyNode<T>(value);
    }

    public final Node<T> getNextNode() {
        throw new AssertionError();
    }
}
