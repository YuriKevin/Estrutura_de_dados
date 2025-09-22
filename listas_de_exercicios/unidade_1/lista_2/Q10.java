package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }
        
        System.out.println("\nArray após substituição dos negativos:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
