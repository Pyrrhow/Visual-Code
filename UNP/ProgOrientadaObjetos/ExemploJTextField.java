package ProgOrientadaObjetos;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ExemploJTextField {

    public static void main(String[] args) {

            JFrame frame = new JFrame("Exemplo JTextField");

            JTextField textField = new JTextField(20);

            frame.setLayout(new FlowLayout());

            frame.add(textField);

            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
    }

}
