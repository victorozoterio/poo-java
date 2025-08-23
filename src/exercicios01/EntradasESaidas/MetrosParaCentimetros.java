/*
Faça uma classe que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
*/

package EntradasESaidas;

import javax.swing.*;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        float valorEmMetros = 0;

        String entrada = JOptionPane.showInputDialog("Digite a quantidade de metros");

        if (entrada == null) {
            JOptionPane.showMessageDialog(null, "Cancelando...");
            System.exit(0);
        }
        if (entrada.equals("")) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        try {
            valorEmMetros = Float.parseFloat(entrada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        float valorEmCentimetros = valorEmMetros * 100;
        JOptionPane.showMessageDialog(null, "Essa quantidade equivale a " + valorEmCentimetros + " centímetros.");
    }
}
