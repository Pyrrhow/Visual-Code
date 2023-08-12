package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame e um JPanel chamado panel. 
Em seguida, configuramos a cor de fundo do painel para amarelo usando o método setBackground(), 
e definimos sua dimensão preferencial para 300 pixels de largura por 200 pixels de altura usando 
o método setPreferredSize(). Em seguida, adicionamos o painel ao conteúdo do JFrame usando 
o método getContentPane().add(panel). Por fim, configuramos o tamanho do JFrame com base no tamanho 
preferencial do painel usando o método pack(), e definimos o comportamento de fechamento e visibilidade do JFrame. 
Quando executamos o programa, uma janela com o painel amarelo é exibida. */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class ExemploJPanel {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo JPanel");
        
        // Cria um painel JPanel
        JPanel panel = new JPanel();
        
        // Define as propriedades do painel
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(400, 350));
        
        // Adiciona o painel ao JFrame
        frame.getContentPane().add(panel);
        
        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
