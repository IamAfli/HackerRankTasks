package com.epam.hakerrank.t06;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            if (!stackOldestOnTop.isEmpty()){
                return stackOldestOnTop.peek();
            } else {
                fillOldestOnTopStack();
            }

            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            if (!stackOldestOnTop.isEmpty()){
                return stackOldestOnTop.pop();
            } else {
                fillOldestOnTopStack();
            }

            return stackOldestOnTop.pop();
        }

        private void fillOldestOnTopStack() {
            while (!stackNewestOnTop.isEmpty()){
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();

            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }

        scan.close();
    }
}
