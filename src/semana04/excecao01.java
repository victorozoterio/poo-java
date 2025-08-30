package semana04;

import javax.swing.JOptionPane;

public class excecao01 {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Idade?")); // exceção unchecked

        try {
            Thread.sleep(1000); // exceção checked
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
