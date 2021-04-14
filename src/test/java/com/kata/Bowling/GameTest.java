package com.kata.Bowling;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @ParameterizedTest
    @CsvSource({ "X,10", "5-,5", "3/|8,26", "X|52,24", "X|X|X|X|X|X|X|X|X|X||XX,300",
            "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||,90", "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5,150",
            "X|7/|9-|X|-8|8/|-6|X|X|X||81,167" })
    void if_given_a_list_of_scores_it_calculates_the_right_total(String scoreInput, int expectedTotal) {
        assertEquals(expectedTotal, Game.calculateScore(scoreInput));
    }
}
