package com.epam.hakerrank.t04_Linked_Lists_Detect_a_Cycle;

import org.junit.Before;
import org.junit.Test;

import com.epam.hakerrank.t04_Linked_Lists_Detect_a_Cycle.CustomLinkedList.Node;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomLinkedListTest {

    private CustomLinkedList list;

    @Before
    public void init(){
        list = new CustomLinkedList();
    }

    @Test
    public void testThatHasCycleReturnsFalseIfHeadPointToNull(){
        Node head = list.new Node();

        assertThat(list.hasCycle(head), is(false));
    }

    @Test
    public void testThatHasCycleReturnsTrueIfListIsCycled(){
        Node head = list.new Node();
        Node node1 = list.new Node(1);
        Node node2 = list.new Node(2);
        Node node3 = list.new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node2);

        assertThat(list.hasCycle(head), is(true));
    }
}