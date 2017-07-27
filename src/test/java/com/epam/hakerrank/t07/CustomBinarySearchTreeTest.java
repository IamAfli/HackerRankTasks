package com.epam.hakerrank.t07;

import org.junit.Before;
import org.junit.Test;

import com.epam.hakerrank.t07.CustomBinarySearchTree.Node;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CustomBinarySearchTreeTest {

    private CustomBinarySearchTree tree;

    @Before
    public void init() {
        tree = new CustomBinarySearchTree();
    }

    @Test
    public void testThatItIsATree() {
        Node node1 = tree.new Node(1);
        Node node2 = tree.new Node(2);
        Node node3 = tree.new Node(3);
        Node node4 = tree.new Node(4);
        Node node5 = tree.new Node(5);
        Node node6 = tree.new Node(6);
        Node node7 = tree.new Node(7);

        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;

        boolean result = tree.checkBST(node4);

        assertThat(result, is(true));
    }

    @Test
    public void testThatItIsNotATreeWhenSameDataInTheLeft() {
        Node node1 = tree.new Node(1);
        Node node2 = tree.new Node(4);
        Node node3 = tree.new Node(3);
        Node node4 = tree.new Node(4);
        Node node5 = tree.new Node(5);
        Node node6 = tree.new Node(6);
        Node node7 = tree.new Node(7);

        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;

        boolean result = tree.checkBST(node4);

        assertThat(result, is(false));
    }

    @Test
    public void testThatItIsNotATreeWhenSameDataInTheRight() {
        Node node1 = tree.new Node(1);
        Node node2 = tree.new Node(2);
        Node node3 = tree.new Node(3);
        Node node4 = tree.new Node(4);
        Node node5 = tree.new Node(5);
        Node node6 = tree.new Node(4);
        Node node7 = tree.new Node(7);

        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;

        boolean result = tree.checkBST(node4);

        assertThat(result, is(false));
    }
}