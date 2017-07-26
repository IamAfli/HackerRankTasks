package com.epam.hakerrank.t04;

public class CustomLinkedList {
    public class Node {
        int data;
        Node next;

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
    }

    public boolean hasCycle(Node head) {
        return false;
    }
}
