package listas_de_exercicios.unidade_1.lista_1;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos vendedores serão informados? ");
        int n = scanner.nextInt();

        double[] vendasBrutas = new double[n];
        int[] contadores = new int[9]; // 8 faixas de $200 a $999, + 1 faixa $1000 ou mais

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor das vendas do vendedor " + (i + 1) + ": ");
            vendasBrutas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double salario = 200 + 0.09 * vendasBrutas[i];

            if (salario >= 200 && salario <= 299) contadores[0]++;
            else if (salario <= 399) contadores[1]++;
            else if (salario <= 499) contadores[2]++;
            else if (salario <= 599) contadores[3]++;
            else if (salario <= 699) contadores[4]++;
            else if (salario <= 799) contadores[5]++;
            else if (salario <= 899) contadores[6]++;
            else if (salario <= 999) contadores[7]++;
            else contadores[8]++;
        }

        String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499",
            "$500 - $599", "$600 - $699", "$700 - $799",
            "$800 - $899", "$900 - $999", "$1000 ou mais"
        };

        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        for (int i = 0; i < contadores.length; i++) {
            System.out.println(faixas[i] + ": " + contadores[i]);
        }
        scanner.close();
    }
}
