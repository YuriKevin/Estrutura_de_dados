package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Lucas deseja gerar: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Informe um número positivo!");
            scanner.close();
            return;
        }

        int[] lucas = new int[N];

        if (N >= 1) lucas[0] = 2;
        if (N >= 2) lucas[1] = 1;

        for (int i = 2; i < N; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }

        System.out.println("\nOs primeiros " + N + " termos da sequência de Lucas:");
        for (int num : lucas) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
