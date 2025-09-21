package listas_de_exercicios.unidade_1.lista_1;
import java.io.*;
import java.util.*;

public class Q23 {
    public static double bytesParaMB(long bytes) {
        return bytes / 1024.0 / 1024.0;
    }

    public static double calcularPercentual(double valor, double total) {
        return (valor / total) * 100.0;
    }

    public static void main(String[] args) {
        String arquivoEntrada = "usuarios.txt";
        String arquivoSaida = "relatorio.txt";

        List<String> usuarios = new ArrayList<>();
        List<Long> espacosBytes = new ArrayList<>();

        // Leitura do arquivo de entrada
        try (Scanner scanner = new Scanner(new File(arquivoEntrada))) {
            while (scanner.hasNext()) {
                String usuario = scanner.next();
                long espaco = scanner.nextLong();
                usuarios.add(usuario);
                espacosBytes.add(espaco);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de entrada não encontrado!");
            return;
        }

        // Conversão de bytes para MB e cálculo do total
        int n = usuarios.size();
        double[] espacosMB = new double[n];
        double totalMB = 0;

        for (int i = 0; i < n; i++) {
            espacosMB[i] = bytesParaMB(espacosBytes.get(i));
            totalMB += espacosMB[i];
        }

        double mediaMB = totalMB / n;

        try (PrintWriter pw = new PrintWriter(new FileWriter(arquivoSaida))) {
            pw.println("ACME Inc. Uso do espaço em disco pelos usuários");
            pw.println("------------------------------------------------------------------------");
            pw.println("Nr. Usuário       Espaço utilizado % do uso");

            for (int i = 0; i < n; i++) {
                double percentual = calcularPercentual(espacosMB[i], totalMB);
                pw.printf("%2d %-15s %7.2f MB %6.2f%%\n", i + 1, usuarios.get(i), espacosMB[i], percentual);
            }

            pw.println();
            pw.printf("Espaço total ocupado: %.2f MB\n", totalMB);
            pw.printf("Espaço médio ocupado: %.2f MB\n", mediaMB);

        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo de saída!");
        }

        System.out.println("Relatório gerado com sucesso: " + arquivoSaida);
    }
}
