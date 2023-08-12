package InterfaceGrafica;
/*Neste exemplo, criamos uma classe MinhaJanela que herda da classe JFrame. 
No construtor da classe MinhaJanela, configuramos as propriedades da janela, 
como o título, tamanho e operação de fechamento. Em seguida, adicionamos os 
componentes desejados à janela e a tornamos visível chamando setVisible(true). 
Por fim, no método main, criamos uma instância da classe MinhaJanela para exibir a janela na tela. */
import javax.swing.JFrame;

public class ExemploJanela extends JFrame {
    
    public ExemploJanela() {
        // Configurações da janela
        setTitle("Minha Janela");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adicione aqui os componentes da sua janela
        
        // Exibe a janela
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Cria uma instância da classe MinhaJanela
        ExemploJanela minhaJanela = new ExemploJanela();
    }
}
