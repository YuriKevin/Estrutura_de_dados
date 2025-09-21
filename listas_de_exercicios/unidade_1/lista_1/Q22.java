package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] contadores = new int[4];
        int totalMouses = 0;

        System.out.println("Registro de mouses - Informe o tipo de defeito:");
        System.out.println("1 - Necessita da esfera");
        System.out.println("2 - Necessita de limpeza");
        System.out.println("3 - Necessita troca do cabo ou conector");
        System.out.println("4 - Quebrado ou inutilizado");
        System.out.println("Digite 0 como ID para encerrar.");

        while (true) {
            System.out.print("\nNúmero de identificação do mouse: ");
            int id = scanner.nextInt();

            if (id == 0) break;

            System.out.print("Tipo de defeito (1 a 4): ");
            int tipo = scanner.nextInt();

            if (tipo >= 1 && tipo <= 4) {
                contadores[tipo - 1]++;
                totalMouses++;
            } else {
                System.out.println("Tipo inválido! Informe um valor entre 1 e 4.");
            }
        }

        System.out.println("\nQuantidade de mouses: " + totalMouses);
        System.out.println("\nSituação\tQuantidade\tPercentual");

        String[] situacoes = {
            "1- necessita da esfera",
            "2- necessita de limpeza",
            "3- necessita troca do cabo ou conector",
            "4- quebrado ou inutilizado"
        };

        for (int i = 0; i < 4; i++) {
            double percentual = (totalMouses > 0) ? ((double) contadores[i] / totalMouses) * 100 : 0;
            System.out.printf("%s\t%d\t%.0f%%\n", situacoes[i], contadores[i], percentual);
        }
        scanner.close();
    }
}
