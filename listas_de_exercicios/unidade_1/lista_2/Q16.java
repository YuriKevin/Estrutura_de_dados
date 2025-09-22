package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        // Preenche o array
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o elemento que deseja procurar: ");
        int valor = scanner.nextInt();

        int indice = -1;

        for (int i = 0; i < n; i++) {
            if (numeros[i] == valor) {
                indice = i;
                break;      
            }
        }
        System.out.println("O índice da primeira ocorrência é: " + indice);
        scanner.close();
    }
}
