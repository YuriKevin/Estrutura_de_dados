package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            numeros[i] = N - i;
        }

        System.out.println("Array em ordem inversa:");
        for (int i = 0; i < N; i++) {
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }
}
