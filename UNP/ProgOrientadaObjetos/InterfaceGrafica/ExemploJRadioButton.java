package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame, um JPanel chamado panel e três JRadioButton chamados radio1, radio2 e radio3. 
Em seguida, criamos um ButtonGroup chamado group e adicionamos os JRadioButton a ele usando o método add(). 
Isso garante que apenas um botão de opção possa ser selecionado ao mesmo tempo. Definimos o layout do JPanel 
como FlowLayout e adicionamos os JRadioButton a ele. Por fim, adicionamos o JPanel ao JFrame e configuramos 
o tamanho do JFrame com base no tamanho preferencial dos componentes usando o método pack(). 
Definimos o comportamento de fechamento e visibilidade do JFrame. Ao executar o programa, 
uma janela com três botões de opção é exibida. O usuário pode selecionar apenas uma opção clicando nos botões de opção. */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

public class ExemploJRadioButton {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo JRadioButton");
        
        // Cria um JPanel para agrupar os radio buttons
        JPanel panel = new JPanel();
        
        // Cria os JRadioButtons
        JRadioButton radio1 = new JRadioButton("Opção 1");
        JRadioButton radio2 = new JRadioButton("Opção 2");
        JRadioButton radio3 = new JRadioButton("Opção 3");
        
        // Cria um ButtonGroup para agrupar os radio buttons
        ButtonGroup group = new ButtonGroup();
        
        // Adiciona os JRadioButtons ao ButtonGroup
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        
        // Define o layout do JPanel
        panel.setLayout(new FlowLayout());
        
        // Adiciona os JRadioButtons ao JPanel
        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);
        
        // Adiciona o JPanel ao JFrame
        frame.add(panel);
        
        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
