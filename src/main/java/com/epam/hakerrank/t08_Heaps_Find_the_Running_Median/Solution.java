package com.epam.hakerrank.t08_Heaps_Find_the_Running_Median;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    private static Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private static Queue<Integer> high = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int listSize = in.nextInt();

        for (int i = 0; i < listSize; i++) {
            int candidate = in.nextInt();

            addNumber(candidate);

            double median = calculateMedian();

            System.out.format("%.1f%n", median);
        }
    }

    static void addNumber(int candidate) {
        if (low.size() <= high.size()){
            low.add(candidate);
        } else {
            high.add(candidate);
        }

        balanceQueues();
    }

    private static void balanceQueues() {
        while(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            int lowHead= low.poll();
            int highHead = high.poll();
            low.add(highHead);
            high.add(lowHead);
        }
    }

    static double calculateMedian() {
        return low.size() == high.size() ?
                (low.peek() + high.peek()) / 2.0
                : low.peek();
    }
}