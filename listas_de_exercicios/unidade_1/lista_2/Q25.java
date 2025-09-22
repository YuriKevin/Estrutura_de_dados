package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O array é um palíndromo.");
        } else {
            System.out.println("O array não é um palíndromo.");
        }
        scanner.close();
    }
}
