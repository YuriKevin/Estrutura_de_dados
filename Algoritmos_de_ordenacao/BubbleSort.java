package Algoritmos_de_ordenacao;

/**
 * Exemplo de implementação do algoritmo Bubble Sort em Java.
 * Esta classe demonstra como ordenar um vetor de inteiros usando
 * o método de ordenação por bolha e exibir o resultado.
 */
public class BubbleSort {

    /**
     * Ordena um array de inteiros utilizando o algoritmo Bubble Sort.
     * O método percorre repetidamente o array, comparando pares de elementos
     * adjacentes e trocando-os se estiverem fora de ordem.
     *
     * @param array o vetor de inteiros que será ordenado
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        // Loop externo controla as passadas
        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            // Loop interno faz as comparações e trocas
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }

            // Se nenhuma troca ocorreu, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }

    /**
     * Método principal que demonstra o uso do Bubble Sort.
     * Cria um vetor de inteiros, imprime seus valores antes da ordenação,
     * aplica o algoritmo Bubble Sort e imprime o resultado ordenado.
     *
     */
    public static void main(String[] args) {
        int[] numeros = { 5, 1, 4, 2, 8 };

        System.out.println("Antes da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");

        bubbleSort(numeros);

        System.out.println("\nDepois da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");
    }
}

