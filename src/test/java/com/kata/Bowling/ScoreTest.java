package com.kata.Bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kata.Bowling.enums.Score;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScoreTest {
    @ParameterizedTest
    @CsvSource({ "STRIKE,X", "SPARE,/", "MISS,-" })
    void get_score_by_symbol(Score score, String symbol) {
        assertEquals(score, Score.getScoreBySymbol(symbol));
    }
}
