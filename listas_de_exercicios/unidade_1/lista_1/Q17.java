package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do atleta (ou pressione Enter para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.isEmpty()) {
                System.out.println("Programa encerrado.");
                break;
            }

            double[] saltos = new double[5];
            double soma = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite a distância do " + (i + 1) + "º salto (em metros): ");
                saltos[i] = scanner.nextDouble();
                soma += saltos[i];
            }
            
            scanner.nextLine();

            System.out.println("\nAtleta: " + nome);
            String[] ordinais = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s Salto: %.1f m\n", ordinais[i], saltos[i]);
            }

            double media = soma / 5;

            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + nome);
            System.out.print("Saltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) System.out.print(" - ");
            }
            System.out.printf("\nMédia dos saltos: %.1f m\n\n", media);
        }
        scanner.close();
    }
}
