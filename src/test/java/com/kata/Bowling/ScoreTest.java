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

    @ParameterizedTest
    @CsvSource({ "STRIKE,2", "SPARE,1", "MISS,0" })
    void each_score_returns_the_correct_frame_look_ahead(Score score, int frameLookAhead) {
        assertEquals(frameLookAhead, score.getFrameLookAhead());
    }

    @ParameterizedTest
    @CsvSource({ "X,10", "/,10", "9,9", "8,8", "7,7", "6,6", "5,5", "4,4", "3,3", "2,2", "1,1", "-,0" })
    void each_symbol_reutrns_the_correct_pin_value(String symbol, int expectedScoreValue) {
        Score score = Score.getScoreBySymbol(symbol);
        assertEquals(expectedScoreValue, score.getPinValue());
    }
}
