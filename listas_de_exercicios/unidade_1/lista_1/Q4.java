package listas_de_exercicios.unidade_1.lista_1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letras = new char[10];
        int qtdConsoantes = 0;       
        String consoantes = "";      

        System.out.println("Digite 10 caracteres (letras):");
        for (int i = 0; i < letras.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            letras[i] = scanner.next().toLowerCase().charAt(0); // pega o primeiro caractere

            // verifica se é letra e não é vogal
            if (Character.isLetter(letras[i]) && !"aeiou".contains(String.valueOf(letras[i]))) {
                qtdConsoantes++;
                consoantes += letras[i] + " ";
            }
        }

        System.out.println("\nQuantidade de consoantes: " + qtdConsoantes);
        if (qtdConsoantes > 0) {
            System.out.println("Consoantes digitadas: " + consoantes);
        }
        scanner.close();
    }
}
