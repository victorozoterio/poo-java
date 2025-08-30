package semana04;

import javax.swing.JOptionPane;

public class excecao02 {
    public static void main(String[] args) {
    
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Idade?")); // exceção checked
            System.out.println("Parabéns, vc digitou um valor inteiro");
        } catch (NumberFormatException e) {
            System.out.println("Você errou!");
        } finally {
            // execução sempre passa por aqui
            // libera recursos
            System.out.println("Passou no finally");
        }
    }
}
