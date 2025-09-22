package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q26 {
    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números primos deseja gerar: ");
        int N = scanner.nextInt();

        int[] primos = new int[N];
        int contador = 0;
        int numero = 2;

        while (contador < N) {
            if (isPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.println("\nOs " + N + " primeiros números primos são:");
        for (int p : primos) {
            System.out.print(p + " ");
        }

        scanner.close();
    }
}
