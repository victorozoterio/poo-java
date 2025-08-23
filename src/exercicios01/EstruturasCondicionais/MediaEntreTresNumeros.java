/*
Faça uma aplicação que leia três números e mostre a média entre eles somente se todos forem positivos.
Caso haja algum número negativo apresente a mensagem "A média não pode ser calculada".
*/

package EstruturasCondicionais;

import javax.swing.*;

public class MediaEntreTresNumeros {
    public static void main(String[] args) {
        final byte VALOR_MINIMO = 0;

        float[] numeros = new float[3];

        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Cancelando...");
                System.exit(0);
            }
            if (entrada.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
                System.exit(0);
            }

            try {
                float numero = Float.parseFloat(entrada);
                if (numero < VALOR_MINIMO) {
                    JOptionPane.showMessageDialog(null, "A média não pode ser calculada.");
                    System.exit(0);
                }
                numeros[i] = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
                System.exit(0);
            }
        }

        float media = (numeros[0] + numeros[1] + numeros[2]) / numeros.length;
        JOptionPane.showMessageDialog(null, "Média = " + media);
    }
}
