package Algoritmos_de_ordenacao;

/**
 * Exemplo de implementação do algoritmo Selection Sort em Java.
 * Esta classe demonstra como ordenar um vetor de inteiros usando
 * o método de seleção e exibir o resultado final.
 */
public class SelectionSort {

    /**
     * Ordena um array de inteiros utilizando o algoritmo Selection Sort.
     * O algoritmo percorre o vetor encontrando o menor elemento da parte
     * não ordenada e trocando-o com o primeiro elemento dessa parte.
     */
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume que o menor elemento está na posição atual
            int indiceMenor = i;

            // Procura o menor elemento no resto do array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Se o menor não está na posição correta, faz a troca
            if (indiceMenor != i) {
                int temp = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = temp;
            }
        }
    }

    /**
     * Método principal que demonstra o uso do Selection Sort.
     * Cria um vetor de inteiros, exibe seus valores antes da ordenação,
     * aplica o algoritmo Selection Sort e exibe o resultado ordenado.
     */
    public static void main(String[] args) {
        int[] numeros = { 29, 10, 14, 37, 14 };

        System.out.println("Antes da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");

        selectionSort(numeros);

        System.out.println("\nDepois da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");
    }
}
