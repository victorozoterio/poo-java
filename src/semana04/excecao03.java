package semana04;

import javax.swing.JOptionPane;

public class excecao03 {
    public static void main(String[] args) {

        while (true) {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Mês?")); // exceção checked
                int a = 30 / n;
                if (n < 1 || n > 12) {
                    JOptionPane.showMessageDialog(null, "Mês inválido");
                    // lançar exceção de mês inválido
                } else {
                    JOptionPane.showMessageDialog(null, "Mês válido");
                    break;
                }
            } catch (Exception e) {
                if (e.toString().contains("Number")) {
                    JOptionPane.showMessageDialog(null, "Digite um valor inteiro!");
                } else if (e.toString().contains("Arithmetic")) {
                    JOptionPane.showMessageDialog(null, "Divisão por zero!");
                } else {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            /*
             * catch (NumberFormatException e) {
             * System.out.println("Digite um valor inteiro!");
             * } catch (ArithmeticException e) {
             * System.out.println("Divisão por zero!");
             * }
             */ finally {
                // execução sempre passa por aqui
                // libera recursos
                System.out.println("Passou no finally");
            }
        }
    }
}
