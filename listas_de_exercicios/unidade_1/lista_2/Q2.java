package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        int[] quadrados = new int[N];

        for (int i = 0; i < N; i++) {
            quadrados[i] = (i + 1) * (i + 1);
        }

        System.out.println("Quadrados de 1 a " + N + ":");
        for (int i = 0; i < N; i++) {
            System.out.println("Quadrado de " + (i + 1) + " = " + quadrados[i]);
        }
        scanner.close();
    }
}
