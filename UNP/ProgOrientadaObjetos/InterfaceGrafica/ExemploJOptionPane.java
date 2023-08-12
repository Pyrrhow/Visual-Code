package InterfaceGrafica;
/*Neste exemplo, usamos a classe JOptionPane para exibir diferentes tipos de caixas de diálogo. 
O método showMessageDialog() exibe uma caixa de diálogo de mensagem com o texto "Olá, Mundo!". 
O método showConfirmDialog() exibe uma caixa de diálogo de confirmação com a pergunta "Você está pronto para continuar?" 
e armazena a resposta do usuário na variável resposta. Em seguida, verificamos se o usuário selecionou "Sim" ou "Não" e 
exibimos a mensagem correspondente usando o método showMessageDialog(). Por fim, usamos o método showInputDialog() 
para exibir uma caixa de diálogo de entrada onde o usuário pode digitar seu nome, e exibimos uma mensagem de saudação 
com o nome digitado ou uma mensagem de erro caso nenhum nome tenha sido digitado. */
import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    
    public static void main(String[] args) {
        // Exibe uma caixa de diálogo de mensagem
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
        
        // Exibe uma caixa de diálogo de confirmação
        int resposta = JOptionPane.showConfirmDialog(null, "Você está pronto para continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        // Verifica a resposta do usuário
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você selecionou Sim!");
        } else {
            JOptionPane.showMessageDialog(null, "Você selecionou Não!");
        }
        
        // Exibe uma caixa de diálogo de entrada
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        
        // Verifica se o usuário digitou um nome
        if (nome != null && !nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome inválido!");
        }
    }
}
