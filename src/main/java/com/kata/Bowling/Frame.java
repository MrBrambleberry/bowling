package com.kata.Bowling;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.kata.Bowling.enums.Score;

public class Frame {
    public ArrayList<Score> scores = new ArrayList<Score>();

    Frame(String twoBallScore) {
        setTwoBallScore(twoBallScore);
    }

    private void setTwoBallScore(String twoBallScore) {
        for (char c : twoBallScore.toCharArray()) {
            this.scores.add(Score.getScoreBySymbol(c));
        }
    }

    public int getTwoBallScore() {
        return scores.stream().collect(Collectors.summingInt(Score::getPinValue));
    }
}
