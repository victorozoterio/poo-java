package semana08;

import javax.swing.*;

public class PessoaFisica extends Pessoa {

    private String cpf, rg;

    public void digitar() {
        super.digitar();
        cpf = JOptionPane.showInputDialog("CPF?");
        rg = JOptionPane.showInputDialog("RG?");
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(cpf);
        System.out.println(rg);
    }
}
