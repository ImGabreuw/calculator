package net.gabreuw.calculator.operators;

public class SquareRoot {

    private double number;

    public SquareRoot(double number) {
        this.number = number;
    }

    public double squareRoot() {

        return Math.sqrt(number);

    }
}
