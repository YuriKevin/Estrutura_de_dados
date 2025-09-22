package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o valor a ser procurado no array: ");
        int valor = scanner.nextInt();

        boolean encontrado = false;

        for (int num : numeros) {
            if (num == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + valor + " está presente no array.");
        } else {
            System.out.println("O valor " + valor + " NÃO está presente no array.");
        }

        scanner.close();
    }
}
