package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o texto que deseja remover: ");
        String textoRemover = scanner.nextLine();

        System.out.println("\nArray antes da remoção:");
        for (String s : array) {
            System.out.print(s + " ");
        }

        int contador = 0;
        for (String s : array) {
            if (!s.equals(textoRemover)) {
                contador++;
            }
        }

        String[] novoArray = new String[contador];
        int indice = 0;
        for (String s : array) {
            if (!s.equals(textoRemover)) {
                novoArray[indice++] = s;
            }
        }

        System.out.println("\n\nArray depois da remoção:");
        for (String s : novoArray) {
            System.out.print(s + " ");
        }
        scanner.close();
    }
}
