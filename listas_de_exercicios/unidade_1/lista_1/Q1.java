package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        scanner.close();
    }
}
