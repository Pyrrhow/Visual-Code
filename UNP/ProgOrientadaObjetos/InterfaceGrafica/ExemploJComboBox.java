package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame, um JPanel chamado panel e um JComboBox chamado comboBox. 
Em seguida, definimos um array de String chamado opcoes que contém as opções que serão exibidas no combobox. 
Criamos o combobox passando o array de opções como argumento do construtor. Definimos o layout do JPanel como FlowLayout 
e adicionamos o JComboBox a ele. Configuramos a ação do combobox usando um ActionListener que é acionado quando uma 
opção é selecionada. No exemplo, exibimos a opção selecionada no console, mas você pode personalizar a ação de acordo com sua necessidade. 
Por fim, adicionamos o JPanel ao JFrame e configuramos o tamanho do JFrame com base no tamanho preferencial dos 
componentes usando o método pack(). Definimos o comportamento de fechamento e visibilidade do JFrame. 
Ao executar o programa, uma janela com um combobox contendo as opções é exibida. 
O usuário pode selecionar uma opção na lista suspensa e a ação será executada. */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJComboBox {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo JComboBox");
        
        // Cria um JPanel
        JPanel panel = new JPanel();
        
        // Cria um array com as opções do combobox
        String[] opcoes = {"Caju", "Manga", "Banana", "Abacate", "Graviola"};
        
        // Cria um JComboBox com as opções
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        
        // Define o layout do JPanel
        panel.setLayout(new FlowLayout());
        
        // Adiciona o JComboBox ao JPanel
        panel.add(comboBox);
        
        // Configura a ação do JComboBox
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtém a opção selecionada
                String opcaoSelecionada = (String) comboBox.getSelectedItem();
                
                // Exibe a opção selecionada
                System.out.println("Opção selecionada: " + opcaoSelecionada);
            }
        });
        
        // Adiciona o JPanel ao JFrame
        frame.add(panel);
        
        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
