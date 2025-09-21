package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int[] vetorIntercalado = new int[30];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.print("C[" + i + "]: ");
            vetorC[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < 10; i++) {
            vetorIntercalado[index++] = vetorA[i];
            vetorIntercalado[index++] = vetorB[i];
            vetorIntercalado[index++] = vetorC[i];
        }

        System.out.println("\nVetor Intercalado:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
        scanner.close();
    }
}
