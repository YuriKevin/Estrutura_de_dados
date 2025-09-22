package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q27 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int contador = 0;
        for (int i = 1; i < N; i++) {
            if (ehPerfeito(i)) {
                contador++;
            }
        }

        int[] perfeitos = new int[contador];
        int indice = 0;

        // Preencher o array
        for (int i = 1; i < N; i++) {
            if (ehPerfeito(i)) {
                perfeitos[indice++] = i;
            }
        }

        System.out.println("\nNúmeros perfeitos menores que " + N + ":");
        for (int num : perfeitos) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static boolean ehPerfeito(int num) {
        int soma = 0;
        for (int i = 1; i <= num / 2; i++) { 
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }
}
