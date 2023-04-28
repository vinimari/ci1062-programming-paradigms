import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        /*
         * 1- Construa um programa em Java que leia um número e diga se ele é positivo.
         */
        // resolveProblem1();

        /*
         * 2- Construa um programa em Java que leia um número inteiro e diga se ele é
         * par ou ímpar
         */
        // resolveProblem2();

        /*
         * 3- Faça um programa em Java que leia números inteiros enquanto não for
         * digitado o número -1, e calcule e imprima a soma destes números.
         */
        resolveProblem3();
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
        System.out.println("Total sum: "+sumNumbers);
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
