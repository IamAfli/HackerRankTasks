package com.epam.hakerrank.t20_Bit_Manipulation_Lonely_Integer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrayLength = in.nextInt();

        int[] numbersMap = new int[101];
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int candidate = in.nextInt();

            array[i] = candidate;
            numbersMap[candidate]++;
        }

        for (int i = 0; i < numbersMap.length; i++) {
            if (numbersMap[i] == 1){
                System.out.println(i);
                break;
            }
        }
    }
}
