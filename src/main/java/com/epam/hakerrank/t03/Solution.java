package com.epam.hakerrank.t03;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution app = new Solution();

        Scanner in = new Scanner(System.in);

        int wordsInMagazineNumber = in.nextInt();
        int wordsInRansomNumber = in.nextInt();

        Map<String, Integer> magazineWords = getWordsFromKeyboard(in, wordsInMagazineNumber);
        Map<String, Integer> ransomWords = getWordsFromKeyboard(in, wordsInRansomNumber);

        boolean result = app.checkMagazineContainsRansom(magazineWords, ransomWords);

        System.out.println(result ? "Yes" : "No");
    }

    private static Map<String, Integer> getWordsFromKeyboard(Scanner in, int numberOfWords) {
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < numberOfWords; i++) {
            String word = in.next();

            Integer wordCount = words.putIfAbsent(word, 1);

            if (wordCount != null) {
                words.put(word, wordCount + 1);
            }
        }

        return words;
    }

    public boolean checkMagazineContainsRansom(Map<String, Integer> magazineWords, Map<String, Integer> ransomWords) {
        for (Map.Entry<String, Integer> ransomPair : ransomWords.entrySet()) {
            String ransomWord = ransomPair.getKey();
            int ransomWordCount = ransomPair.getValue();

            Integer magazineCount = magazineWords.get(ransomWord);

            if (magazineCount == null || magazineCount < ransomWordCount){
                return false;
            }
        }

        return true;
    }
}