package Algoritmos_de_ordenacao;

/**
 * Exemplo de implementação do algoritmo Insertion Sort em Java.
 * Esta classe demonstra como ordenar um vetor de inteiros usando
 * o método de inserção e exibir o resultado final.
 */
public class InsertionSort {

    /**
     * Ordena um array de inteiros utilizando o algoritmo Insertion Sort.
     * O algoritmo percorre o array da esquerda para a direita e insere cada
     * elemento na posição correta em relação aos elementos anteriores.
     *
     * @param array o vetor de inteiros que será ordenado
     */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            // Move os elementos maiores que a chave para a direita
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }

            // Insere a chave na posição correta
            array[j + 1] = chave;
        }
    }

    /**
     * Método principal que demonstra o uso do Insertion Sort.
     * Cria um vetor de inteiros, exibe seus valores antes da ordenação,
     * aplica o algoritmo Insertion Sort e exibe o resultado ordenado.
     */
    public static void main(String[] args) {
        int[] numeros = { 9, 3, 1, 5, 4 };

        System.out.println("Antes da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");

        insertionSort(numeros);

        System.out.println("\nDepois da ordenação:");
        for (int n : numeros)
            System.out.print(n + " ");
    }
}
