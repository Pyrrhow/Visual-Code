package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame e dois JCheckBox chamados checkBox1 e checkBox2. 
Os JCheckBox representam duas opções que podem ser selecionadas ou desmarcadas. 
Definimos o layout do JFrame como FlowLayout, que organiza os componentes em uma única linha. 
Adicionamos os JCheckBox ao JFrame usando o método add(). Por fim, configuramos o tamanho do JFrame 
com base no tamanho preferencial dos componentes usando o método pack(), e definimos o comportamento 
de fechamento e visibilidade do JFrame. Quando executamos o programa, uma janela com duas caixas de seleção é exibida. 
O usuário pode selecionar uma ou ambas as opções clicando nas caixas de seleção. */
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class ExemploJCheckBox {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo JCheckBox");
        
        // Cria dois JCheckBox
        JCheckBox checkBox1 = new JCheckBox("Caju");
        JCheckBox checkBox2 = new JCheckBox("Banana");
        JCheckBox checkBox3 = new JCheckBox("Manga");
        
        // Define o layout do JFrame
        frame.setLayout(new FlowLayout());
        
        // Adiciona os JCheckBox ao JFrame
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);

        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
