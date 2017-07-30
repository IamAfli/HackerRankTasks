package com.epam.hakerrank.t11;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckerTest {

    @Test
    public void testCkeckerOnAnArray(){
        Player[] players = new Player[5];
        players[0] = new Player("amy", 100);
        players[1] = new Player("david", 100);
        players[2] = new Player("heraldo", 50);
        players[3] = new Player("aakansha", 75);
        players[4] = new Player("aleksa", 150);

        Arrays.sort(players, new Checker());

        Player[] expected = new Player[5];
        expected[0] = new Player("aleksa", 150);
        expected[1] = new Player("amy", 100);
        expected[2] = new Player("david", 100);
        expected[3] = new Player("aakansha", 75);
        expected[4] = new Player("heraldo", 50);

        assertThat(players, is(expected));
    }
}