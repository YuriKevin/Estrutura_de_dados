package listas_de_exercicios;

import java.util.Scanner;

public class Q3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.printf("\nMédia = %.2f\n", media);
        scanner.close();
    }
}
