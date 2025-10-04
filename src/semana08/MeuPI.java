package semana08;

import javax.swing.*;
import java.awt.*;

public class MeuPI extends JFrame {

    private JButton btOriginal;
    private MeuBotao btPersonal;

    public MeuPI() {
        setBounds(100, 100, 300, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btOriginal = new JButton("original");
        btPersonal = new MeuBotao("personal");
        add(btOriginal);
        add(btPersonal);
    }

    public static void main(String[] args) {
        MeuPI m = new MeuPI();
        m.setVisible(true);
    }
}
