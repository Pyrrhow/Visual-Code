package ProgOrientadaObjetos;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;

public class ExemploCheckBox {

    public static void main(String[] args) {

            JFrame frame = new JFrame("Exemplo JCheckBox");
            
            JCheckBox checkBox1 = new JCheckBox("Banana");
            JCheckBox checkBox2 = new JCheckBox("Caju");
            JCheckBox checkBox3 = new JCheckBox("Manga");

            frame.setLayout(new FlowLayout());
            
            frame.add(checkBox1);
            frame.add(checkBox2);
            frame.add(checkBox3);

            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }

}
