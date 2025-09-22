package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array original: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array vazio!");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("\nArray antes: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nDigite a posição do elemento a ser removido (0 a " + (n-1) + "): ");
        int pos = scanner.nextInt();
        if (pos < 0 || pos >= n) {
            System.out.println("Posição inválida!");
            scanner.close();
            return;
        }

        int[] novoArray = new int[n - 1];

        for (int i = 0; i < pos; i++) {
            novoArray[i] = array[i];
        }

        for (int i = pos + 1; i < n; i++) {
            novoArray[i - 1] = array[i];
        }

        System.out.print("\nArray depois: ");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
