package listas_de_exercicios.unidade_1.lista_2;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os elementos em ordem crescente:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor a ser buscado: ");
        int valor = scanner.nextInt();

        int resultado = buscaBinaria(array, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
        } else {
            System.out.println("Valor não encontrado no array.");
        }

        scanner.close();
    }

    // Função de busca binária
    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                return meio; // encontrado
            } else if (array[meio] < valor) {
                inicio = meio + 1; // buscar à direita
            } else {
                fim = meio - 1; // buscar à esquerda
            }
        }

        return -1; // não encontrado
    }
}
