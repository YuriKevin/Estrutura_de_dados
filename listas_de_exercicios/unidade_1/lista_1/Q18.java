package listas_de_exercicios.unidade_1.lista_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q18{
    public static double calcularPercentual(int votos, int total) {
        return ((double) votos / total) * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votosJogadores = new int[24];
        int totalVotos = 0;

        System.out.println("Enquete:\nQuem foi o melhor jogador?");

        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            } else if (numero >= 1 && numero <= 23) {
                votosJogadores[numero]++;
                totalVotos++;
            } else {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
            }
        }

        int melhorJogador = 0;
        int maiorVotos = 0;
        for (int i = 1; i <= 23; i++) {
            if (votosJogadores[i] > maiorVotos) {
                maiorVotos = votosJogadores[i];
                melhorJogador = i;
            }
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("\nResultado da votação:\n\n");
        resultado.append("Foram computados ").append(totalVotos).append(" votos.\n");
        resultado.append("Jogador | Votos | %\n");

        for (int i = 1; i <= 23; i++) {
            if (votosJogadores[i] > 0) {
                double percentual = calcularPercentual(votosJogadores[i], totalVotos);
                resultado.append(String.format("%d      |   %d   |   %.1f%%\n", i, votosJogadores[i], percentual));
            }
        }

        if (melhorJogador != 0) {
            double percMelhor = calcularPercentual(maiorVotos, totalVotos);
            resultado.append(String.format("\nO melhor jogador foi o número %d, com %d votos, correspondendo a %.1f%% do total de votos.\n",
                    melhorJogador, maiorVotos, percMelhor));
        }

        System.out.println(resultado);

        try (PrintWriter pw = new PrintWriter(new FileWriter("resultado_votacao.txt"))) {
            pw.print(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
        scanner.close();
    }
}
