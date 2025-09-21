package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        String[] respostas = new String[5];
        int respostasSim = 0;

        System.out.println("Responda com 'sim' ou 'nao'.\n");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " ");
            respostas[i] = scanner.next().toLowerCase();

            if (respostas[i].equals("sim")) {
                respostasSim++;
            }
        }
        System.out.println("\nClassificação:");
        if (respostasSim == 5) {
            System.out.println("Assassino");
        } else if (respostasSim >= 3) {
            System.out.println("Cúmplice");
        } else if (respostasSim == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
        scanner.close();
    }
}
