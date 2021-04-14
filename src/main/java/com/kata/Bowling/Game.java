package com.kata.Bowling;

import com.kata.Bowling.enums.Score;

public class Game {

    public static int calculateScore(String gameString) {
        String[] frames = gameString.split("\\|\\|");
        String regularFrames = frames[0];

        char[] scores = regularFrames.replace("|", "").toCharArray();
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            Score score = Score.getScoreBySymbol(scores[i]);
            if (score != null) {
                if (score == Score.STRIKE) {
                    if (i + 1 < scores.length) {
                        total += Score.getScoreBySymbol(scores[i + 1]).getPinValue();
                    }
                    if (i + 2 < scores.length) {
                        total += Score.getScoreBySymbol(scores[i + 2]).getPinValue();
                    }
                }

                if (score == Score.SPARE) {
                    if (i + 1 < scores.length) {
                        Score nextBall = Score.getScoreBySymbol(scores[i + 1]);

                        if (nextBall == Score.MISS && i + 2 < scores.length) {
                            nextBall = Score.getScoreBySymbol(scores[i + 2]);
                        }

                        total += nextBall.getPinValue();
                    }

                    score.setPinValue(10 - Score.getScoreBySymbol(scores[i - 1]).getPinValue());
                }

                total += score.getPinValue();
            }
        }

        if (frames.length > 1) {
            char[] bonusFrames = frames[1].toCharArray();
            for (int i = 0; i < bonusFrames.length; i++) {
                Score score = Score.getScoreBySymbol(bonusFrames[i]);
                if (score != null) {
                    if (score == Score.STRIKE) {
                        if (i + 1 < bonusFrames.length) {
                            total += Score.getScoreBySymbol(bonusFrames[i + 1]).getPinValue();
                        }
                        if (i + 2 < bonusFrames.length) {
                            total += Score.getScoreBySymbol(bonusFrames[i + 2]).getPinValue();
                        }
                    }

                    if (score == Score.SPARE) {
                        if (i + 1 < bonusFrames.length) {
                            total += Score.getScoreBySymbol(bonusFrames[i + 1]).getPinValue();
                        }

                        score.setPinValue(10 - Score.getScoreBySymbol(bonusFrames[i - 1]).getPinValue());
                    }
                    total += score.getPinValue();
                }
            }
        }

        return total;

    }
}
