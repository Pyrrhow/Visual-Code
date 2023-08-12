package InterfaceGrafica;

/*Neste exemplo, criamos uma classe ExemploBotao que possui um construtor onde criamos 
uma instância de JFrame com o título "Exemplo de JButton". Em seguida, criamos um objeto JButton com o 
texto "Clique Aqui!" e definimos sua posição e tamanho usando o método setBounds(). 
Adicionamos o botão à janela usando o método add(). Por fim, definimos o layout da 
janela como nulo (null) e a tornamos visível chamando setVisible(true). */
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploBotao {
    
    public ExemploBotao() {
        JFrame janela = new JFrame("Exemplo de JButton");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton botao = new JButton("Clique Aqui!");
        botao.setBounds(100, 50, 100, 50);
        
        janela.add(botao);
        
        janela.setLayout(null);
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        ExemploBotao exemplo = new ExemploBotao();
    }
}
