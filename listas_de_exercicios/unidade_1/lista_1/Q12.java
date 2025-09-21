package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = scanner.nextDouble();

            somaAlturas += alturas[i];
        }

        double mediaAltura = somaAlturas / 30.0;

        int count = 0;
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                count++;
            }
        }

        System.out.printf("\nMédia de altura dos alunos: %.2f m\n", mediaAltura);
        System.out.println("Número de alunos com mais de 13 anos e altura abaixo da média: " + count);
        scanner.close();
    }
}
