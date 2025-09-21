package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int somaQuadrados = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
            somaQuadrados += A[i] * A[i];
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n\nSoma dos quadrados dos elementos: " + somaQuadrados);
        scanner.close();
    }
}
