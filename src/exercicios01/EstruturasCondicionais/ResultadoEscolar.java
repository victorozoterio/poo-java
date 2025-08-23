/*
Faça uma aplicação que receba a nota de duas provas (a nota deve ser um valor entre 0 e 10). A seguir,
apresente a média e o resultado final, conforme a tabela abaixo:

Média                    Resultado

<5                       Reprovado
>=5 e <7                 Recuperação
>=7                      Aprovado
*/

package EstruturasCondicionais;

import javax.swing.*;

public class ResultadoEscolar {
    public static void main(String[] args) {
        final byte NOTA_MINIMA = 0;
        final byte NOTA_MAXIMA = 10;

        float[] notas = new float[2];

        for (int i = 0; i < notas.length; i++) {
            String entrada = JOptionPane.showInputDialog("Digite a nota da prova " + (i + 1));

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Cancelando...");
                System.exit(0);
            }
            if (entrada.equals("")) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
                System.exit(0);
            }

            try {
                float nota = Float.parseFloat(entrada);
                if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido!");
                    System.exit(0);
                }
                notas[i] = nota;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor Inválido!");
                System.exit(0);
            }
        }

        float media = (notas[0] + notas[1]) / notas.length;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media >= 5) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}
