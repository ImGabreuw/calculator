package net.gabreuw.calculator.operators;

public class Mod {

    private double number1;
    private double number2;

    public Mod(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double mod() {

        return number1 % number2;

    }

}
