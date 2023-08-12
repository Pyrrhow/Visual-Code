package InterfaceGrafica;

/*Crie uma interface gráfica em Java que contenha um botão com o texto "Clique Aqui". 
Ao clicar no botão, exiba uma caixa de diálogo com a mensagem "Você clicou no botão". */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploFacil {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Fácil");
        JButton button = new JButton("Clique Aqui");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Você clicou no botão");
            }
        });
        
        // Define propriedades do JFrame
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
