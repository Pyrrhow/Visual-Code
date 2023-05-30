package ProgOrientadaObjetos;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ExemploBotao {

    public static void main(String[] args) {

            JFrame janela = new JFrame("Exemplo JButton");
            janela.setSize(300,200);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton botao = new JButton("Clique Aqui!");
            botao.setBounds(100,50,100,50);

            janela.add(botao);

            janela.setLayout(null);
            janela.setVisible(true);
    }

}
