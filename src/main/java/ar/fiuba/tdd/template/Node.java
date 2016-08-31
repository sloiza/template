package ar.fiuba.tdd.template;


public abstract class Node<T> {
    public abstract boolean isEmpty();

    public abstract T getData();

    public abstract int size();

    public abstract Node<T> insertData(T value);

    public abstract Node<T> getNextNode();
}

