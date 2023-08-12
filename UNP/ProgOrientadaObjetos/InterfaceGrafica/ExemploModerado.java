package InterfaceGrafica;

/*Crie uma interface gráfica em Java com dois campos de texto e um botão. Ao digitar um texto nos campos e clicar no botão, 
concatene os textos dos campos em uma única string e exiba o resultado em uma caixa de diálogo. */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploModerado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Interface Gráfica");
        JPanel panel = new JPanel();
        
        JTextField textField1 = new JTextField(40);
        JTextField textField2 = new JTextField(20);
        JTextField textField3 = new JTextField(40);
        JButton button = new JButton("Concatenar");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto1 = textField1.getText();
                String texto2 = textField2.getText();
                String texto3 = textField3.getText();
                String resultado = texto1 + " " + texto2 + " " + texto3;
                JOptionPane.showMessageDialog(frame, resultado);
            }
        });
        
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        panel.add(button);
        
        // As propriedades do Frame
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
