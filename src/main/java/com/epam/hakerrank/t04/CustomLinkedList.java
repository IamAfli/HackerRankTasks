package com.epam.hakerrank.t04;

import java.util.HashSet;
import java.util.Set;

public class CustomLinkedList {
    public class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public int hashCode() {
            return data;
        }
    }

    public boolean hasCycle(Node head) {
        Set<Node> passedNodes = new HashSet<>();

        Node current = head;

        while (current != null) {
            if (!passedNodes.contains(current)) {
                passedNodes.add(current);
                current = current.next;
            } else {
                return true;
            }
        }

        return false;
    }
}
