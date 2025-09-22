package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonacci deseja gerar: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Informe um número positivo!");
            scanner.close();
            return;
        }

        int[] fibonacci = new int[N];

        if (N >= 1) fibonacci[0] = 0;
        if (N >= 2) fibonacci[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("\nOs primeiros " + N + " números da sequência de Fibonacci:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
