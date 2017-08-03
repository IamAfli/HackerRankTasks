package com.epam.hakerrank.t15_BFS_Shortest_Reach_in_a_Graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static final int EDGE_LENGTH = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfQueries = sc.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            int numberOfNodes = sc.nextInt();
            int numberOfEdges = sc.nextInt();

            Node[] nodes = createNodes(numberOfNodes);

            connectNodes(nodes, numberOfEdges, sc);

            int startNode = sc.nextInt();
            calculateDistances(nodes[startNode - 1]);

            printResult(nodes, startNode);
        }

        sc.close();
    }

    private static void connectNodes(Node[] nodes, int numberOfEdges, Scanner sc) {
        for (int i = 0; i < numberOfEdges; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            nodes[node1 - 1].addConnectedNodes(nodes[node2 - 1]);
        }
    }

    private static Node[] createNodes(int numberOfNodes) {
        Node[] nodes = new Node[numberOfNodes];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i + 1);
        }

        return nodes;
    }

    static void calculateDistances(Node startNode) {
        ArrayDeque<Node> deque = new ArrayDeque<>();

        startNode.distance = 0;
        deque.add(startNode);
        while (!deque.isEmpty()) {
            Node currentNode = deque.remove();
            for (Node connectedNode : currentNode.connectedNodes) {
                if (connectedNode.distance == -1){
                    connectedNode.distance = currentNode.distance + EDGE_LENGTH;
                    deque.add(connectedNode);
                }
            }
        }
    }

    private static void printResult(Node[] nodes, int startNode) {
        for (int i = 0; i < nodes.length; i++) {
            if (startNode - 1 != i) {
                System.out.format("%d ", nodes[i].distance);
            }
        }
        System.out.println();
    }

    static class Node {

        private int nodeName;
        private Set<Node> connectedNodes;
        int distance;

        public Node(int nodeName) {
            this.nodeName = nodeName;
            connectedNodes = new HashSet<>();
            distance = -1;
        }

        public void addConnectedNodes(Node node) {
            connectedNodes.add(node);
            node.connectedNodes.add(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            return nodeName == node.nodeName;
        }

        @Override
        public int hashCode() {
            return nodeName;
        }
    }
}
