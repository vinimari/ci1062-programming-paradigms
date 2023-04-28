import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // 1. Construa um programa em Java que leia um número e diga se ele é positivo.
        resolveProblem1();
    }

    static void resolveProblem1() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer = "O número é nulo";

        System.out.println("Digite um número inteiro: ");
        number = scanner.nextInt();

        if (number > 0) {
            answer = "O número é positivo";
        } else {
            answer = "O número é negativo";
        }

        System.out.println(answer);
    }

}
