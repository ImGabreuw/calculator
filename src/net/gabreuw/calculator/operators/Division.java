package net.gabreuw.calculator.operators;

public class Division {

    private double number1;
    private double number2;

    public Division(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double division() {

        return number1 / number2;

    }

}
