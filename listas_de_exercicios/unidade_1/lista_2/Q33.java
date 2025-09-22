package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q33 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array original: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("\nArray antes: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nDigite o novo elemento a ser adicionado: ");
        int novoElemento = scanner.nextInt();

        int[] novoArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            novoArray[i] = array[i];
        }

        novoArray[n] = novoElemento;

        System.out.print("\nArray depois: ");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
