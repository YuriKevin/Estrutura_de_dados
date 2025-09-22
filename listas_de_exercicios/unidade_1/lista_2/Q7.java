package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos em posições pares é: " + soma);
        scanner.close();
    }
}
