package InterfaceGrafica;

/*Crie uma interface gráfica em Java com um campo de texto e um botão. Ao digitar um texto no campo e clicar no botão, 
exiba uma caixa de diálogo com o conteúdo digitado no campo de texto. */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploMedio {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Interface Gráfica");
        JPanel panel = new JPanel();
        
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Exibir");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = textField.getText();
                JOptionPane.showMessageDialog(frame, textoDigitado);
            }
        });
        
        panel.add(textField);
        panel.add(button);
        
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

