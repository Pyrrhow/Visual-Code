package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame e um JTextField chamado textField. 
Definimos o tamanho do JTextField para 20 colunas usando o construtor JTextField(20). 
Em seguida, definimos o layout do JFrame como FlowLayout usando o método setLayout(new FlowLayout()), 
que organiza os componentes em uma única linha. Adicionamos o JTextField ao JFrame usando o método add(textField). 
Por fim, configuramos o tamanho do JFrame com base no tamanho preferencial do JTextField usando o método pack(), 
e definimos o comportamento de fechamento e visibilidade do JFrame. Quando executamos o programa, uma janela com uma caixa de texto é exibida. */
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class ExemploJTextField {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo JTextField");
        
        // Cria um JTextField
        JTextField textField = new JTextField(20);
        
        // Define o layout do JFrame
        frame.setLayout(new FlowLayout());
        
        // Adiciona o JTextField ao JFrame
        frame.add(textField);
        
        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
