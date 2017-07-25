package com.epam.hakerrank.t03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution app = new Solution();

        Scanner in = new Scanner(System.in);

        int wordsInMagazineNumber = in.nextInt();
        int wordsInRansomNumber = in.nextInt();

        List<String> magazineWords = getWordsFromKeyboard(in, wordsInMagazineNumber);
        List<String> ransomWords = getWordsFromKeyboard(in, wordsInRansomNumber);

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        System.out.println(result ? "Yes" : "No");
    }

    private static List<String> getWordsFromKeyboard(Scanner in, int numberOfWords) {
        List<String> words = new LinkedList<>();
        for (int i = 0; i < numberOfWords; i++) {
            words.add(in.next());
        }

        return words;
    }

    public boolean checkMagazineContainsRansom(List<String> magazineWords, List<String> ransomWords) {
        // TODO: 25/07/17
        throw new UnsupportedOperationException();
    }
}