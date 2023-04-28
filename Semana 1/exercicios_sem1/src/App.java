import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // 1. Construa um programa em Java que leia um número e diga se ele é positivo.
        resolveProblem1();

        // 2. Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar
        resolveProblem2();
    }

    static void resolveProblem2() { 
        Scanner scanner = new Scanner(System.in); 
        int number; 
        String answer = " it's even"; 
        
        System.out.println("\n## Problem 2 ##");
        System.out.print("Enter an integer value: ");
        number = scanner.nextInt();

        if (number % 2 == 0) { 
            answer = " it's odd";
        }

        System.out.println(number+answer);
    }

    static void resolveProblem1() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer = " it's null";

        System.out.println("\n## Problem 1 ##");
        System.out.print("Enter an integer value: ");
        number = scanner.nextInt();

        if (number > 0) {
            answer = " it's positive";
        } else {
            answer = " it's negative";
        }

        System.out.println(number+answer);
    }

}
