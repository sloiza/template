package ar.fiuba.tdd.template;

public class MyQueue<T> implements QueueInterface<T> {
    private Node<T> node;

    public MyQueue() {
        this.node = new EmptyNode<T>();
    }

    public MyQueue(T value) {
        this.node = new NotEmptyNode<T>(value);
    }

    public final boolean isEmpty() {
        return this.node.isEmpty();
    }

    public final int size() {
        return this.node.size();
    }


    public final void add(T item) {
        this.node  = this.node.insertData(item);
    }

    public final T top() {
        return this.node.getData();
    }

    public  final void remove() {
        this.node = this.node.getNextNode();

    }
}
