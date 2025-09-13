package semana05;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Texto {
    /**
     * Exibe o inverso da palavra recebida
     * @param s - palavra recebida
     */
    public static void inverter(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    /**
     * Retorna o inverso da palavra recebida
     * @param s - palavra recebida
     * @return - palavra retornada
     */
    public static String espelhar(String s) {
        String palavra = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            palavra += s.charAt(i);
        }
        return palavra;
    }

    /**
     * Armazena o texto fornecido em um arquivo .txt
     * @param texto - o texto a ser armazenado
     * @param path - o caminho e nome do arquivo
     */
    public static void salvar(String texto, String path) {
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.print(texto);
            pw.close();
            System.out.println("Arquivo salvo com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    /**
     * Armazena o texto fornecido em um arquivo .txt
     * @param texto - o texto a ser armazenado
     * @param path - o caminho e o nome do arquivo
     * @return - true em caso de sucesso e false em caso de falha
     */
    public static boolean save(String texto, String path) {
        boolean success = false;
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.print(texto);
            pw.close();
            System.out.println("Arquivo salvo com sucesso!");
            success = true;
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
        return success;
    }

    /**
     * Armazena o texto fornecido em um arquivo .txt
     * @param texto - o texto a ser armazenado
     * @param path - o caminho e o nome do arquivo
     * @param file - o nome do arquivo
     * @return - um texto informando o resultado
     */
    public static String save(String texto, String path, String file) {
        String r = "Arquivo salvo com sucesso!";
        try {
            PrintWriter pw = new PrintWriter(path + "/" + file);
            pw.print(texto);
            pw.close();
        } catch (FileNotFoundException e) {
            r = "Erro ao salvar o arquivo: " + e.getMessage();
        }
        System.out.println(r);
        return r;
    }

    /**
     * Retorna uma senha aleatória contendo dígitos numéricos
     * @param qtdeDigitos - a quantidade de dígitos
     * @return - a senha aleatória
     */
    public static String gerarSenha(int qtdeDigitos) {
        String senha = "";
        for (int i = 1; i <= qtdeDigitos; i++) {
            senha += (int) (Math.random() * 10);
        }
        return senha;
    }
}
