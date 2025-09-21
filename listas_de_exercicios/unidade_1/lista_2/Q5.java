package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("O array precisa ter pelo menos 2 elementos.");
            return;
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior, segundoMaior;
        if (numeros[0] > numeros[1]) {
            maior = numeros[0];
            segundoMaior = numeros[1];
        } else {
            maior = numeros[1];
            segundoMaior = numeros[0];
        }

        for (int i = 2; i < n; i++) {
            if (numeros[i] > maior) {
                segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] > segundoMaior && numeros[i] < maior) {
                segundoMaior = numeros[i];
            }
        }

        System.out.println("O segundo maior elemento é: " + segundoMaior);
        scanner.close();
    }
}
