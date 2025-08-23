/*
Faça uma aplicação para receber um número qualquer e informar na tela se é par ou ímpar.
*/

package EstruturasCondicionais;

import javax.swing.*;

public class ImparOuPar {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um número");

        if (entrada != null) {
            if(!entrada.equals("")) {
                try {
                    int valor = Integer.parseInt(entrada);

                    if (valor % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Par");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ímpar");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }
    }
}
