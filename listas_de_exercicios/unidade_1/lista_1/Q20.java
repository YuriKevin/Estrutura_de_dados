package listas_de_exercicios.unidade_1.lista_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<Double> abonos = new ArrayList<>();

        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");

        while (true) {
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            if (salario == 0) {
                break;
            }

            salarios.add(salario);

            double abono = salario * 0.2;
            if (abono < 100) {
                abono = 100;
            }
            abonos.add(abono);
        }

        System.out.println("\nSalário - Abono");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.printf("R$ %.2f - R$ %.2f\n", salarios.get(i), abonos.get(i));
        }

        int totalColaboradores = salarios.size();
        double totalAbonos = 0;
        int numMinimo = 0;
        double maiorAbono = 0;

        for (double abono : abonos) {
            totalAbonos += abono;
            if (abono == 100) {
                numMinimo++;
            }
            if (abono > maiorAbono) {
                maiorAbono = abono;
            }
        }

        System.out.println("\nForam processados " + totalColaboradores + " colaboradores");
        System.out.printf("Total gasto com abonos: R$ %.2f\n", totalAbonos);
        System.out.println("Valor mínimo pago a " + numMinimo + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f\n", maiorAbono);

        scanner.close();
    }
}
