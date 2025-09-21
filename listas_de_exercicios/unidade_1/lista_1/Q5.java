package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];     
        int[] impares = new int[20];   
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[qtdPares] = numeros[i];
                qtdPares++;
            } else {
                impares[qtdImpares] = numeros[i];
                qtdImpares++;
            }
        }

        System.out.println("\nVetor raiz:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nVetor de pares:");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nVetor de ímpares:");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        scanner.close();
    }
}
