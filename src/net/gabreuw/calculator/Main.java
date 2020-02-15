package net.gabreuw.calculator;

import net.gabreuw.calculator.operators.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static double number1;
    private static double number2;

    public static void main(String[] args) {

        Locale locale = Locale.US;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação: ");
        System.out.println();
        System.out.println("1 - adição");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.println("5 - Mod");
        System.out.println("6 - potência");
        System.out.println("7 - raíz quadradda");
        System.out.println();

        int operation = scanner.nextInt();

        switch (operation) {

            case 1:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();


                Addition addition = new Addition(number1, number2);

                System.out.println("A soma entre " + number1 + " e " + number2 + " é igual a " + addition.addition());
                break;

            case 2:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();

                Subtraction subtraction = new Subtraction(number1, number2);

                System.out.println("A diferença entre " + number1 + " e " + number2 + " é igual a " + subtraction.subtraction());
                break;

            case 3:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();

                Multiplication multiplication = new Multiplication(number1, number2);

                System.out.println("A multiplicação entre " + number1 + " e " + number2 + " é igual a " + multiplication.multiplication());
                break;

            case 4:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();

                Division division = new Division(number1, number2);

                System.out.println("A divisão entre " + number1 + " e " + number2 + " é igual a " + division.division());
                break;

            case 5:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();

                Mod mod = new Mod(number1, number2);

                System.out.println("O resto entre " + number1 + " e " + number2 + " é igual a " + mod.mod());
                break;

            case 6:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                System.out.println("Escolha um número: ");
                number2 = scanner.nextDouble();

                Power power = new Power(number1, number2);

                System.out.println(number1 + " elevado à " + number2 + " é igual a " + power.power());

            case 7:

                System.out.println("Escolha um número: ");
                number1 = scanner.nextDouble();

                if (number1 < 0) {

                    System.out.println("A raíz quadrada de número negativo não é possível ser resolvida!");
                    break;

                }

                SquareRoot squareRoot = new SquareRoot(number1);

                System.out.println("A raíz quadrada de " + number1 + " é igual a " + squareRoot.squareRoot());

            default:

                System.out.println("Operação invalida!");
        }

    }

}
