package com.epam.hakerrank.t11_Sorting_Comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        int compareScore = Integer.compare(p1.score, p2.score);

        if (compareScore == 0) {
            return p1.name.compareTo(p2.name);
        } else {
            return -compareScore;
        }
    }
}
