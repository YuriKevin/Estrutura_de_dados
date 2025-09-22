package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int contadorPares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("\nQuantidade de números pares no array: " + contadorPares);
        scanner.close();
    }
}
