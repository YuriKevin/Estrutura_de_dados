package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] arrayOriginal = new int[n];
        int[] arrayCopia = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            arrayOriginal[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrayCopia[i] = arrayOriginal[i];
        }

        System.out.println("\nArray Original:");
        for (int num : arrayOriginal) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray Copiado:");
        for (int num : arrayCopia) {
            System.out.print(num + " ");
        }

        scanner.close();
    }  
}
