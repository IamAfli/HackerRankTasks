package com.epam.hakerrank.t07;

import java.util.ArrayList;
import java.util.List;

public class CustomBinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    boolean checkBST(Node root) {
        List<Node> iterableNodes = new ArrayList<>();

        fillIterableNodes(root, iterableNodes);

        for (int i = 0; i < iterableNodes.size() - 1; i++) {
            if (iterableNodes.get(i).data >= iterableNodes.get(i + 1).data) {
                return false;
            }
        }

        return true;
    }

    private void fillIterableNodes(Node root, List<Node> iterableNodes) {
        if (root == null) {
            return;
        }

        fillIterableNodes(root.left, iterableNodes);

        iterableNodes.add(root);

        fillIterableNodes(root.right, iterableNodes);
    }
}
