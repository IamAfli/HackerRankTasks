package com.epam.hakerrank.t03;

import java.util.*;

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
        Collections.sort(magazineWords);
        Collections.sort(ransomWords);

        Iterator<String> ransomIterator = ransomWords.iterator();
        while (ransomIterator.hasNext()) {
            String ransomWord = ransomIterator.next();

            Iterator<String> magazineIterator = magazineWords.iterator();

            while (magazineIterator.hasNext()){
                String magazineWord = magazineIterator.next();

                int comparationResult = ransomWord.compareTo(magazineWord);

                if (comparationResult < 0){
                    break;
                } else if (comparationResult == 0){
                    ransomIterator.remove();
                    magazineIterator.remove();
                    break;
                }
            }
        }

        return ransomWords.isEmpty();
    }
}