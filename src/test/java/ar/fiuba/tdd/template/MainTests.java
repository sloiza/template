package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void testNew() {
        MyQueue<Integer> queue = new MyQueue<Integer>(8);
        assertSame(queue.top(),8);
    }

    @Test
    public void isEmpty() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        assertTrue(queue.isEmpty());

        queue.add(4);
        assertFalse(queue.isEmpty());

        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAdd() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(2);
        queue.add(4);
        queue.add(8);
        queue.add(16);
        assertEquals(queue.size(),4);
    }

    @Test
    public void testRemove() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(2);
        queue.add(4);

        assertEquals(queue.size(),2);

        queue.remove();
        assertEquals(queue.size(),1);

        queue.remove();
        assertEquals(queue.size(),0);
    }

    @Test
    public void size() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        assertEquals(queue.size(),0);

        queue.add(1);
        assertEquals(queue.size(),1);

        queue.add(2);
        queue.add(3);
        queue.add(4);
        assertEquals(queue.size(),4);

        queue.remove();
        assertEquals(queue.size(),3);
    }


    @Test
    public void testTop() {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(5);
        assertSame(queue.top(),5);
        assertEquals(queue.size(),1);

        queue.add(11);
        assertSame(queue.top(),5);

        queue.add(17);
        assertSame(queue.top(),5);

        queue.remove();
        assertSame(queue.top(),11);
    }

}
