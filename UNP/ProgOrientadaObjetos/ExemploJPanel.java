package ProgOrientadaObjetos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class ExemploJPanel {

    public static void main(String[] args) {

            JFrame frame = new JFrame("Exemplo JPanel");

            JPanel panel = new JPanel();

            panel.setBackground(Color.BLUE);
            panel.setPreferredSize(new Dimension(800, 600));

            frame.getContentPane().add(panel);

            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }

}
