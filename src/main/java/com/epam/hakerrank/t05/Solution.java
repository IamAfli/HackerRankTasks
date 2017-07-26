package com.epam.hakerrank.t05;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static boolean isBalanced(String expression) {
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (!stack.isEmpty()) {
                if (checkParenthesisIsClosed(stack.getFirst(), currentChar)) {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            } else {
                stack.push(currentChar);
            }
        }

        return stack.isEmpty();
    }

    private static boolean checkParenthesisIsClosed(Character openingParethesis, char closingParethesis) {
        switch (openingParethesis) {
            case '{':
                return closingParethesis == '}';
            case '[':
                return closingParethesis == ']';
            case '(':
                return closingParethesis == ')';
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfStrings = in.nextInt();

        for (int i = 0; i < numberOfStrings; i++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
