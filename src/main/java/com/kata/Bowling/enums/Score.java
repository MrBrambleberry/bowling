package com.kata.Bowling.enums;

public enum Score {

    STRIKE("X"), SPARE("/"), MISS("-");

    private final String symbol;

    private Score(String symbol) {
        this.symbol = symbol;
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

}
