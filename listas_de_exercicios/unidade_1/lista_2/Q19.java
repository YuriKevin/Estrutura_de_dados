package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q19 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.println("\nArray antes da inversão:");
        for (String s : array) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < n / 2; i++) {
            String temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("\n\nArray depois da inversão:");
        for (String s : array) {
            System.out.print(s + " ");
        }

        scanner.close();
    }
}
