package listas_de_exercicios.unidade_1.lista_2;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] temp = new int[n];
        int tamanhoNovo = 0;

        for (int i = 0; i < n; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamanhoNovo; j++) {
                if (array[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                temp[tamanhoNovo] = array[i];
                tamanhoNovo++;
            }
        }

        int[] arrayFinal = new int[tamanhoNovo];
        for (int i = 0; i < tamanhoNovo; i++) {
            arrayFinal[i] = temp[i];
        }

        System.out.println("\nArray sem elementos repetidos:");
        for (int num : arrayFinal) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
