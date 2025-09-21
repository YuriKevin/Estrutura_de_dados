package listas_de_exercicios.unidade_1.lista_1;

import java.util.Random;

public class Q24 {
    public static int lancarDado(Random rand) {
        return rand.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int[] resultados = new int[100];
        int[] contadores = new int[6];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            resultados[i] = lancarDado(rand);
            contadores[resultados[i] - 1]++; //array vai de 0 a 5, por isso o decremento, que representam os números de 1 a 6
        }

        System.out.println("Face do dado - Quantidade de ocorrências");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " - " + contadores[i]);
        }
    }
}
