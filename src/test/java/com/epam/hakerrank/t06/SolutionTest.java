package com.epam.hakerrank.t06;

import com.epam.hakerrank.t06.Solution.MyQueue;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    private MyQueue<Integer> queue;

    @Before
    public void init(){
        queue = new MyQueue<>();
    }

    @Test
    public void testEnqueAndPeek(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertThat(queue.peek(), is(1));
    }

    @Test
    public void testDequeRemovesElements(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();

        assertThat(queue.peek(), is(3));
    }

    @Test
    public void testDequeReturnsElements(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertThat(queue.dequeue(), is(1));
    }
}