package semana02;

import javax.swing.JOptionPane;

public class Nota {

	public static void main(String[] args) {
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da nota?"));
		JOptionPane.showMessageDialog(null, nota);
	}

}

