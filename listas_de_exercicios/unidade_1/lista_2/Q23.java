package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Preenchendo o primeiro array:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o tamanho do segundo array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Preenchendo o segundo array:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] arrayNovo = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arrayNovo[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            arrayNovo[n1 + i] = array2[i];
        }

        System.out.println("\nNovo array (unindo os dois):");
        for (int num : arrayNovo) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
