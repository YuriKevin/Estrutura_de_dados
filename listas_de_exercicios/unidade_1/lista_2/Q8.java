package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q8 {
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

        System.out.print("Digite o valor pelo qual deseja multiplicar: ");
        int multiplicador = scanner.nextInt();

        System.out.println("\nAntes da multiplicação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < n; i++) {
            numeros[i] *= multiplicador;
        }

        System.out.println("\nDepois da multiplicação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
