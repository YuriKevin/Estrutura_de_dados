package listas_de_exercicios.unidade_1.lista_1;
import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double valor;

        System.out.println("Digite as notas (ou -1 para encerrar):");
        while (true) {
            System.out.print("Nota: ");
            valor = scanner.nextDouble();
            if (valor == -1) {
                break;
            }
            notas.add(valor);
        }

        System.out.println("\nQuantidade de notas lidas: " + notas.size());

        System.out.println("\nNotas na ordem informada:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = (notas.size() > 0) ? soma / notas.size() : 0;

        System.out.printf("\nSoma das notas: %.2f\n", soma);
        System.out.printf("Média das notas: %.2f\n", media);

        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        int abaixoSete = 0;
        for (double nota : notas) {
            if (nota < 7) {
                abaixoSete++;
            }
        }
        System.out.println("Quantidade de notas abaixo de 7: " + abaixoSete);
        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}
