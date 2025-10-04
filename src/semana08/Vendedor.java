package semana08;

import javax.swing.*;

public class Vendedor extends Funcionario{

    private float comissao;

    public void digitar() {
        super.digitar();
        comissao = Float.parseFloat(JOptionPane.showInputDialog("Comissão?"));
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(comissao);
    }
}
