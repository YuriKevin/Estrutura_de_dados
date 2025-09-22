package listas_de_exercicios.unidade_1.lista_2;
    import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int primeiro = array[0];
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = primeiro;

        System.out.println("\nArray após rotação para a esquerda:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
