package semana05;

import javax.swing.JOptionPane;

public class UsarTexto {
    public static void main(String[] args) {
        String s = "garrafa";
        // Texto.inverter(s);

        String sEspelhado = Texto.espelhar(s);
        System.out.println("Original: " + s);
        System.out.println("Espelhado: " + sEspelhado);

        // Texto.salvar(sEspelhado, "/Users/victorozoterio/Fatec/java/poo/semana05/arquivo.txt");

        boolean success = Texto.save(sEspelhado, "/Users/victorozoterio/Fatec/java/poo/semana05/arquivo.txt");
        if (success) {
           JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo!");
        }

        JOptionPane.showMessageDialog(null, Texto.save(sEspelhado, "/Users/victorozoterio/Fatec/java/poo/semana05", "file.txt"));

        JOptionPane.showMessageDialog(null, Texto.gerarSenha(10));
    }
}
