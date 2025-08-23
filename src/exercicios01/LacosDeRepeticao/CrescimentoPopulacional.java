/*
Suponha que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B
seja 200000 habitantes com uma taxa de crescimento de 1,5%. Elabore um aplicativo que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
*/

package LacosDeRepeticao;

import javax.swing.*;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        long popA = 80000;
        long popB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;

        int anos = 0;

        while (popA < popB) {
            popA += Math.round(popA * taxaA);
            popB += Math.round(popB * taxaB);
            anos++;
        }

        String mensagem = "Tempo necessário para a população A ultrapassar ou igualar a população B: " + anos + " anos"
                + "\nPopulação de A após " + anos + " anos: " + popA + " habitantes"
                + "\nPopulação de B após " + anos + " anos: " + popB + " habitantes";

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
