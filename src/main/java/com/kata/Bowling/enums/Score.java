package com.kata.Bowling.enums;

public enum Score {

    STRIKE('X', 2, 10), SPARE('/', 1, 0), NINE('9', 0, 9), EIGHT('8', 0, 8), SEVEN('7', 0, 7), SIX('6', 0, 6),
    FIVE('5', 0, 5), FOUR('4', 0, 4), THREE('3', 0, 3), TWO('2', 0, 2), ONE('1', 0, 1), MISS('-', 0, 0);

    private final char symbol;
    private final int frameLookAhead;
    private int pinValue;

    private Score(char symbol, int frameLookAhead, int pinValue) {
        this.symbol = symbol;
        this.frameLookAhead = frameLookAhead;
        this.pinValue = pinValue;
    }

    public static Score getScoreBySymbol(char symbol) {
        for (Score score : values()) {
            if (score.symbol == symbol) {
                return score;
            }
        }

        return null;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public int getFrameLookAhead() {
        return this.frameLookAhead;
    }

    public int getPinValue() {
        return this.pinValue;
    }

    public void setPinValue(int pinValue) {
        this.pinValue = pinValue;
    }
}
