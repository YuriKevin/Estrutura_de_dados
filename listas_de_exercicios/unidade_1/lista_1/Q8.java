package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            alturas[i] = scanner.nextDouble();
        }
        System.out.println("\nDados em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + " anos, Altura: " + alturas[i] + " m");
        }
        scanner.close();
    }
}
