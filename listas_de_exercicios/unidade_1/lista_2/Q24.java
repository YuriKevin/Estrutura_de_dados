package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nDigite a posição para inserir (0 a " + n + "): ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Posição inválida!");
            scanner.close();
            return;
        }

        System.out.print("Digite o elemento a inserir: ");
        int elem = scanner.nextInt();

        int[] novoArray = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            novoArray[i] = array[i];
        }

        novoArray[pos] = elem;

        for (int i = pos; i < n; i++) {
            novoArray[i + 1] = array[i];
        }

        System.out.println("\nArray após a inserção:");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
