package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < 10; i++) {
            vetorC[index++] = vetorA[i];
            vetorC[index++] = vetorB[i];
        }

        System.out.println("\nVetor C (intercalado):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        scanner.close();
    }
}
