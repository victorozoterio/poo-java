package semana02;

import javax.swing.JOptionPane;

public class For03 {

	public static void main(String[] args) {
		String[] nomes = new String[10];

		for(int i = 0; i<nomes.length;i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite um nome: ");
			System.out.println(nomes[i]);
		}

		for(String s:nomes) {
			System.out.println(s);
		}
	}
}
