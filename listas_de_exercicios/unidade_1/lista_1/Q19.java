package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q19 {
    public static int calcularPercentual(int votos, int total) {
        if (total == 0) return 0;
        return (int) Math.round(((double) votos / total) * 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sistemas = { "", "Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro" };
        int[] votos = new int[7];
        int totalVotos = 0;

        System.out.println("Enquete: Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("Opções: 1-Windows Server, 2-Unix, 3-Linux, 4-Netware, 5-Mac OS, 6-Outro");
        System.out.println("Digite 0 para encerrar a votação.");

        while (true) {
            System.out.print("Número do Sistema Operacional (0=fim): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            } else if (escolha >= 1 && escolha <= 6) {
                votos[escolha]++;
                totalVotos++;
            } else {
                System.out.println("Opção inválida! Digite um número entre 1 e 6 ou 0 para sair.");
            }
        }

        int maisVotado = 1;
        for (int i = 2; i <= 6; i++) {
            if (votos[i] > votos[maisVotado]) {
                maisVotado = i;
            }
        }

        System.out.println("\nSistema Operacional Votos %");
        System.out.println("------------------- ----- ---");

        for (int i = 1; i <= 6; i++) {
            int perc = calcularPercentual(votos[i], totalVotos);
            System.out.printf("%-16s %5d %3d%%\n", sistemas[i], votos[i], perc);
        }

        System.out.println("------------------- -----");
        System.out.println("Total " + totalVotos);

        System.out.printf("\nO Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %d%%\n",
        sistemas[maisVotado], votos[maisVotado], calcularPercentual(votos[maisVotado], totalVotos));
        scanner.close();
    }
}
