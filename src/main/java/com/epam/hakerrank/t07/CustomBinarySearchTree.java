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
        List<Node> nodes = new ArrayList<>();

        fillNodes(root, nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            if (nodes.get(i).data >= nodes.get(i + 1).data) {
                return false;
            }
        }

        return true;
    }

    private void fillNodes(Node root, List<Node> nodes) {
        if (root == null) {
            return;
        }

        fillNodes(root.left, nodes);

        nodes.add(root);

        fillNodes(root.right, nodes);
    }
}
