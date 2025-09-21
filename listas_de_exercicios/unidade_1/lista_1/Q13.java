package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double mediaAnual = soma / 12.0;
        System.out.printf("\nMédia anual de temperatura: %.2f°C\n", mediaAnual);
        System.out.println("\nMeses com temperatura acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%s: %.2f°C\n", meses[i], temperaturas[i]);
            }
        }
        scanner.close();
    }
}
