package semana08;

import javax.swing.*;

public abstract class Pessoa {
    private int numero;
    protected String nome;

    public void digitar() {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número?"));
        nome = JOptionPane.showInputDialog("Nome?");
    }

    public void mostrar() {
        System.out.println(numero);
        System.out.println(nome);
    }
}
