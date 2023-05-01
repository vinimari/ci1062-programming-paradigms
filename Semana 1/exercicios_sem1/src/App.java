import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int optionSelected;

        System.out.println("Wich method run? 1-8");
        optionSelected = scanner.nextInt();

        switch (optionSelected) {
            /*
             * 1- Construa um programa em Java que leia um número e diga se ele é positivo.
             */
            case 1:
                resolveProblem1();
                break;

            /*
             * 2- Construa um programa em Java que leia um número inteiro e diga se ele é
             * par ou ímpar
             */
            case 2:
                resolveProblem2();
                break;

            /*
             * 3- Faça um programa em Java que leia números inteiros enquanto não for
             * digitado o número -1, e calcule e imprima a soma destes números.
             */
            case 3:
                resolveProblem3();
                break;

            /*
             * 4- Faça um programa em Java que calcule e imprima a soma dos 10 primeiros
             * múltiplos de
             */
            case 4:
                resolveProblem4();
                break;
            /*
             * 5- Construa um programa em Java que leia um número x, calcule e escreva o
             * valor
             * da função f(x), dada por:
             * a) 0 <= x < 5, f(x) = x
             * b) 5<= x <10; f(x) = 2x + 1
             * c) x >=10; f(x) = x - 3
             */
            case 5:
                resolveProblem5();
                break;

            /*
             * 8- Faça um programa em Java que leia os valores do peso e da altura de
             * pessoas,
             * enquanto não for digitado o número -1, conte e escreva quantas pessoas estão
             * acima do peso. A condição (peso /(altura*altura)) <= 25 diz que a pessoa está
             * no peso normal.
             */

            case 8:
                resolveProblem8();
                break;
        }

    }

    static void resolveProblem8() {
        Scanner scanner = new Scanner(System.in);
        int overweightCount = 0, count = 0;
        double heigth = 0, weigth = 0, imc;

        System.out.println("\n## Problem 8 ##");

        while (heigth != -1 && weigth != -1) {
            count++;

            // get heigh
            System.out.println("Enter people " + count + " heigh in meters: ");
            heigth = scanner.nextDouble();

            if (heigth != -1) {

                // get weigth
                System.out.println("Enter people " + count + " weigth in kg: ");
                weigth = scanner.nextDouble();

                // imc formula
                imc = weigth / (heigth * heigth);

                if (imc > 25) {
                    overweightCount++;
                }
            }
        }

        System.out.println("\nResult: "+overweightCount + " people are overweigth");
    }

    static void resolveProblem5() {
        Scanner scanner = new Scanner(System.in);
        int number, answer = 0;

        System.out.println("\n## Problem 5 ##");
        System.out.println("Enter an integer value: ");
        number = scanner.nextInt();

        if (number >= 0 && number < 5)
            answer = number;
        else if (number >= 5 && number < 10)
            answer = 2 * number + 1;
        else if (number >= 10)
            answer = number - 3;

        System.out.println("f(x) = " + answer);
    }

    static void resolveProblem4() {
        System.out.println("\n## Problem 4 ##");
        int number = 3, totalSum = 0;

        for (int multiplier = 0; multiplier < 9; multiplier++) {
            totalSum = totalSum + number * multiplier;
        }

        System.out.println(totalSum);
    }

    static void resolveProblem3() {
        Scanner scanner = new Scanner(System.in);
        int number = 0, sumNumbers = 0;

        System.out.println("\n## Problem 3 ##");
        while (number != -1) {
            System.out.print("Enter an integer value: ");
            number = scanner.nextInt();

            if (number != -1) {
                sumNumbers = sumNumbers + number;
            }
        }
        System.out.println("Total sum: " + sumNumbers);
    }

    static void resolveProblem2() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer = " is even";

        System.out.println("\n## Problem 2 ##");
        System.out.print("Enter an integer value: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            answer = " is odd";
        }

        System.out.println(number + answer);
    }

    static void resolveProblem1() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer = " is null";

        System.out.println("\n## Problem 1 ##");
        System.out.print("Enter an integer value: ");
        number = scanner.nextInt();

        if (number > 0) {
            answer = " is positive";
        } else {
            answer = " is negative";
        }

        System.out.println(number + answer);
    }

}
