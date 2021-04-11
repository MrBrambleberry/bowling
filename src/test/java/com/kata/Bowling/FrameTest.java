package com.kata.Bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FrameTest {

    @ParameterizedTest
    @CsvSource({ "X,10" })
    void frame_returns_correct_two_ball_score(String twoBallScore, int expectedScore) {
        Frame frame = new Frame(twoBallScore);
        assertEquals(expectedScore, frame.getTwoBallScore());
    }

}
