package com.epam.hakerrank.t04_Linked_Lists_Detect_a_Cycle;

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
    }

    public boolean hasCycle(Node head) {
        Node oneStepNode = head;
        Node twoStepNode = head;

        while (true){
            if (oneStepNode == null || twoStepNode == null || twoStepNode.next == null){
                return false;
            }

            oneStepNode = oneStepNode.next;
            twoStepNode = twoStepNode.next.next;

            if (oneStepNode == twoStepNode){
                return true;
            }
        }
    }
}
