package com.epam.hakerrank.t06_Queues_A_Tale_of_Two_Stacks;

import com.epam.hakerrank.t06_Queues_A_Tale_of_Two_Stacks.Solution.MyQueue;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    private MyQueue<Integer> queue;

    @Before
    public void init() {
        queue = new MyQueue<>();
    }

    @Test
    public void testEnqueAndPeek() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            assertThat(queue.peek(), is(0));
        }
    }

    @Test
    public void testDequeRemovesElements() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 9; i++) {
            queue.dequeue();
        }

        assertThat(queue.peek(), is(9));
    }

    @Test
    public void testDequeReturnsElements() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            assertThat(queue.dequeue(), is(i));
        }
    }
}