/*
Faça uma classe que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5* (F-32)/9).
*/

package EntradasESaidas;

import javax.swing.*;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        float valorEmCelsius = 0;

        String entrada = JOptionPane.showInputDialog("Digite a temperatura em °C");

        if (entrada == null) {
            JOptionPane.showMessageDialog(null, "Cancelando...");
            System.exit(0);
        }
        if (entrada.equals("")) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        try {
            valorEmCelsius = Float.parseFloat(entrada);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            System.exit(0);
        }

        float valorEmFahrenheit = (valorEmCelsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "Essa temperatura equivale a " + valorEmFahrenheit + " °F.");
    }
}
