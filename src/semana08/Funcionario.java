package semana08;

import javax.swing.*;

public class Funcionario extends PessoaFisica {

    private double salario;

    public void digitar() {
        super.digitar();
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário?"));
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(salario);
    }
}
