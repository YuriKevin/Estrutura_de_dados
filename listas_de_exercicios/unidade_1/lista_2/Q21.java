package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q21 {
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

        System.out.println("\nArray antes da substituição:");
        for (char c : array) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < n; i++) {
            char c = Character.toLowerCase(array[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                array[i] = '*';
            }
        }

        System.out.println("\n\nArray depois da substituição:");
        for (char c : array) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
