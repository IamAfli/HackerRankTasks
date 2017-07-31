package com.epam.hakerrank.t18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfStairs = in.nextInt();
        for(int i = 0; i < numberOfStairs; i++){
            int n = in.nextInt();

            System.out.println(findPossibleVariants(n));
        }
    }

    static int findPossibleVariants(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(!map.containsKey(n)) {
            int count = findPossibleVariants(n-1) + findPossibleVariants(n-2) + findPossibleVariants(n-3);
            map.put(n, count);
        }
        return map.get(n);
    }
}
