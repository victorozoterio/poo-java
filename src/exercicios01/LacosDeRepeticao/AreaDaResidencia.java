/*
Elabore um aplicativo que possibilite calcular a área total de uma residência (sala, cozinha, quartos, área de serviço, quintal, garagem etc.). O
programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido
e também uma mensagem solicitando a confirmação para continuar calculando novos cômodos. Caso o usuário responda "NÃO", o programa deve
apresentar o valor total acumulado da área residencial
*/

package LacosDeRepeticao;

import javax.swing.*;

public class AreaDaResidencia {
    public static void main(String[] args) {
        double areaTotal = 0.0;

        while (true) {
            String nomeComodo = JOptionPane.showInputDialog("Digite o nome do cômodo:");
            if (nomeComodo == null || nomeComodo.equals("")) {
                JOptionPane.showMessageDialog(null, "Cancelando...");
                System.exit(0);
            }

            String entradaLargura = JOptionPane.showInputDialog("Digite a largura do cômodo " + nomeComodo + " (em metros):");
            if (entradaLargura == null || entradaLargura.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                System.exit(0);
            }

            double largura = 0.0;
            try {
                largura = Double.parseDouble(entradaLargura);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                System.exit(0);
            }

            String entradaComprimento = JOptionPane.showInputDialog("Digite o comprimento do cômodo " + nomeComodo + " (em metros):");
            if (entradaComprimento == null || entradaComprimento.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                System.exit(0);
            }

            double comprimento = 0.0;
            try {
                comprimento = Double.parseDouble(entradaComprimento);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                System.exit(0);
            }

            double areaComodo = largura * comprimento;
            JOptionPane.showMessageDialog(null, "Área do(a) " + nomeComodo + " = " + areaComodo + " m²");

            areaTotal += areaComodo;

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro cômodo?", "Continuar?", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Área total da residência = " + areaTotal + " m²");
                break;
            }
        }
    }
}
