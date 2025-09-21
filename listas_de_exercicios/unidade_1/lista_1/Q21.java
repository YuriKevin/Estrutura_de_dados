package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modelos = new String[5];
        double[] consumo = new double[5];
        final double DISTANCIA = 1000.0;
        final double PRECO_LITRO = 2.25;

        System.out.println("Comparativo de Consumo de Combustível");

        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.print("Nome: ");
            modelos[i] = scanner.nextLine();

            System.out.print("Km por litro: ");
            consumo[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nRelatório Final");
        int maisEconomicoIndex = 0;

        for (int i = 0; i < 5; i++) {
            double litros = DISTANCIA / consumo[i];
            double custo = litros * PRECO_LITRO;

            System.out.printf("%d - %s - %.1f - %.1f litros - R$ %.2f\n",
                    i + 1, modelos[i], consumo[i], litros, custo);

            if (consumo[i] > consumo[maisEconomicoIndex]) {
                maisEconomicoIndex = i;
            }
        }

        System.out.println("\nO menor consumo é do " + modelos[maisEconomicoIndex] + ".");
        scanner.close();
    }
}
