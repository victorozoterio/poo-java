/*
Elabore um aplicativo que apresente todos os números divisíveis por 4, sendo menores que 200. Para verificar se o número é divisível por 4, insira dentro
da malha de verificação lógica desta condição com a instrução se, pergunte se o número é divisível; sendo, mostre-o, não sendo, passe para o próximo passo.
*/

package LacosDeRepeticao;

import javax.swing.*;

public class NumerosDivisiveisPorQuatro {
    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Números divisíveis por 4 menores que 200:\n");

        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                resultado.append(i).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
