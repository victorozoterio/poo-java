package semana01;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		if(args.length == 2) {
			float n1 =	Float.parseFloat(args[0]);
			float n2 =	Float.parseFloat(args[1]);
			float soma = n1+n2;

			//System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é: " + soma);
			JOptionPane.showMessageDialog(null, "Resultados\nSoma: "+soma+ "\nSubtração: "+(n1-n2)+"\nMultiplicação: "+(n1*n2)+"\nDivisão: "+(n1/n2));
		}else {
			System.out.println("FORNEÇA DOIS ELEMENTOS!");
		}
	}
}
