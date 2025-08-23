/*
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*/

package EntradasESaidas;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        float altura = 0;

        String entrada = JOptionPane.showInputDialog("Digite sua altura em metros");

        if (entrada == null) {
            JOptionPane.showMessageDialog(null, "Cancelando...");
            System.exit(0);
        }
        if (entrada.equals("")) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        try {
            altura = Float.parseFloat(entrada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        double pesoIdeal = (72.7 * altura) - 58;
        JOptionPane.showMessageDialog(null, String.format("Seu peso ideal é de %.2f Kg", pesoIdeal));
    }
}
