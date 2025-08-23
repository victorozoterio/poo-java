package semana03;

import javax.swing.JOptionPane;

public class Math02 {
    public static void main(String[] args) {
        final int PASSAGEIROS_POR_ONIBUS = 40;

        float numeroAlunos = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de alunos: "));

        System.out.println("Número de onibus necessários: " + (int) Math.ceil(numeroAlunos / PASSAGEIROS_POR_ONIBUS));
    }
}
