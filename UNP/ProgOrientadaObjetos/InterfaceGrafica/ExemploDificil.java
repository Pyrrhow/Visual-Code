package InterfaceGrafica;

/*Crie uma interface gráfica em Java que simule um jogo de adivinhação. 
Inclua um campo de texto para o jogador digitar um número e um botão para confirmar a resposta. 
O programa deve gerar um número aleatório entre 1 e 10 e verificar se o número digitado pelo jogador é igual 
ao número gerado. Exiba uma mensagem indicando se o jogador acertou ou errou. */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ExemploDificil {
    private static int numeroAleatorio;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo de Adivinhação");
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Digite um número de 1 a 10:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Confirmar");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroDigitado = Integer.parseInt(textField.getText());
                if (numeroDigitado == numeroAleatorio) {
                    JOptionPane.showMessageDialog(frame, "Parabéns! Você acertou!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Que pena! Tente novamente.");
                }
                reiniciarJogo();
            }
        });
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        iniciarJogo();
    }
    
    private static void iniciarJogo() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(10) + 1;
    }
    
    private static void reiniciarJogo() {
        iniciarJogo();
    }
}
