package com.epam.hakerrank.t07;

public class CustomBinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }
    }

    boolean checkBST(Node root) {
        if (root == null){
            return true;
        }

        boolean isLeftATree = false;
        if (root.left != null){
            if (root.left.data >= root.data){
                return false;
            }
        }
        isLeftATree = checkBST(root.left);

        boolean isRightATree = false;
        if (root.right != null){
            if (root.right.data <= root.data){
                return false;
            }
        }
        isRightATree = checkBST(root.right);

        return isLeftATree && isRightATree;
    }

}
