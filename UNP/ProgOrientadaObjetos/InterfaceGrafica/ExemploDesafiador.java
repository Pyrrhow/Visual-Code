package InterfaceGrafica;

/*Crie uma interface gráfica em Java com uma lista suspensa (combobox) contendo três opções: "Opção 1", "Opção 2" e "Opção 3". 
Ao selecionar uma opção da lista, exiba uma caixa de diálogo com o texto da opção selecionada. */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploDesafiador {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Interface Gráfica");
        JPanel panel = new JPanel();
        
        String[] opcoes = {"Caju", "Banana", "Maçã", "Abacate", "Cajá"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcaoSelecionada = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Opção selecionada: " + opcaoSelecionada);
            }
        });
        
        panel.add(comboBox);
        
        // As propriedades do Frame
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
