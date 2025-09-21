package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;

public class Q2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Digite 10 números de ponto flutuante:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        scanner.close();
    }
}

