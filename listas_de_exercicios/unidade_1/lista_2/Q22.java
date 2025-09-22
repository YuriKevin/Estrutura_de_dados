package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de caracteres: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o caractere " + (i + 1) + ": ");
            array[i] = scanner.nextLine().charAt(0);
        }

        // Contar vogais
        int contador = 0;
        for (int i = 0; i < n; i++) {
            char c = Character.toLowerCase(array[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("\nNúmero de vogais no array: " + contador);
        scanner.close();
    }
}
