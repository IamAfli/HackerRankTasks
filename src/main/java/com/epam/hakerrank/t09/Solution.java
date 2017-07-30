package com.epam.hakerrank.t09;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Trie trie = new Solution().new Trie();

        int numberOfOperations = in.nextInt();
        for (int i = 0; i < numberOfOperations; i++) {
            String operation = in.next();
            String text = in.next();

            if (operation.equals("add")) {
                trie.add(text);
            } else if (operation.equals("find")) {
                int result = trie.find(text);
                System.out.println(result);
            }
        }
    }

    class TrieNode {
        private HashMap<Character, TrieNode> children = new HashMap<>();
        public int size;

        public void putChildIfAbsent(char ch) {
            children.putIfAbsent(ch, new TrieNode());
        }

        public TrieNode getChild(char ch) {
            return children.get(ch);
        }
    }

    class Trie {
        TrieNode root = new TrieNode();

        public void add(String text) {
            TrieNode current = root;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                current.putChildIfAbsent(ch);
                current = current.getChild(ch);

                current.size++;
            }
        }

        public int find(String prefix) {
            TrieNode current = root;

            for (int i = 0; i < prefix.length(); i++) {
                Character ch = prefix.charAt(i);

                current = current.getChild(ch);

                if (current == null) {
                    return 0;
                }
            }

            return current.size;
        }
    }
}