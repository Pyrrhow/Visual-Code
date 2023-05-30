package ProgOrientadaObjetos;
import javax.swing.JOptionPane;

public class SaidaNome {

    public static void main(String[]args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o Sobrenome: ");

        String nomeCompleto = nome + " " + sobrenome;

        JOptionPane.showMessageDialog(null,"Nome Completo: "+nomeCompleto, "informação",JOptionPane.INFORMATION_MESSAGE);


    }
    
}
