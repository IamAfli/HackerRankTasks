package com.epam.hakerrank.t15_BFS_Shortest_Reach_in_a_Graph;

import com.epam.hakerrank.t15_BFS_Shortest_Reach_in_a_Graph.Solution.Node;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void testCase1() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.addConnectedNodes(node2);
        node1.addConnectedNodes(node3);

        Solution.calculateDistances(node1);

        int[] result = {node2.distance, node3.distance, node4.distance};
        int[] expected = {6, 6, -1};

        assertThat(result, is(expected));
    }

    @Test
    public void testCase2() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node2.addConnectedNodes(node3);

        int startNode = 2;

        Solution.calculateDistances(node2);

        int[] result = {node1.distance, node3.distance};
        int[] expected = {-1, 6};

        assertThat(result, is(expected));
    }
}