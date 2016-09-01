package ar.fiuba.tdd.template;

public interface QueueInterface<T> {
    boolean isEmpty();

    int size();

    void add(T item); // add item to the end

    T top(); // return first item, throw exception if it is empty.

    void remove(); // remove first item, throw exception if it is empty.
}
