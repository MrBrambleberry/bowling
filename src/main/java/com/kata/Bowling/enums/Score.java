package com.kata.Bowling.enums;

public enum Score {

    STRIKE("X", 2), SPARE("/", 1), MISS("-", 0);

    private final String symbol;
    private final int frameLookAhead;

    private Score(String symbol, int frameLookAhead) {
        this.symbol = symbol;
        this.frameLookAhead = frameLookAhead;
    }

    public static Score getScoreBySymbol(String symbol) {
        for (Score score : values()) {
            if (score.symbol.equals(symbol)) {
                return score;
            }
        }

        return null;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getFrameLookAhead() {
        return this.frameLookAhead;
    }

}
