package net.gabreuw.calculator.operators;

public class Power {

    private double number1;
    private double number2;

    public Power(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double power() {

        return Math.pow(number1, number2);

    }
}
