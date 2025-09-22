package listas_de_exercicios.unidade_1.lista_2;

import java.util.Random;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println("\nArray gerado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Bubble Sort decrescente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) { 
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nArray em ordem decrescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
