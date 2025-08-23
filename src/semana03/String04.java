package semana03;

import javax.swing.JOptionPane;

public class String04 {
  public static void main(String[] args) throws InterruptedException {
    String termos = "sexo sexual drogas";

    String s = JOptionPane.showInputDialog("Digite o termo de busca: ");

    if (termos.contains(s)) {
      JOptionPane.showMessageDialog(null, "Termo proibido");
    } else {
      JOptionPane.showMessageDialog(null, "Termo permitido");
    }
  }
}