package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos arrays: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] resultado = new int[n];

        System.out.println("Preenchendo o primeiro array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Preenchendo o segundo array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        System.out.println("\nResultado da multiplicação elemento a elemento:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
