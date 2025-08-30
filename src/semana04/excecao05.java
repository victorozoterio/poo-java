package semana04;

import javax.swing.JOptionPane;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class excecao05 {
    public static void main(String[] args) {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("/Users/victorozoterio/Downloads/log.txt");
            pw.write("Início da gravação...\n");

            while (true) {
                String s = JOptionPane.showInputDialog("Digite...");
                if (s == null) {
                    break;
                }

                pw.write(s + "\n");
            }

            pw.write("Fim da gravação...\n");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } finally {
            pw.close();
        }
    }
}
