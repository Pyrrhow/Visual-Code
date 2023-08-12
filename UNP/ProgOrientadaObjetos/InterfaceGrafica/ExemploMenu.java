package InterfaceGrafica;
/*Neste exemplo, criamos um JFrame chamado frame, um JPanel chamado panel, uma JToolBar chamada toolBar e uma JMenuBar chamada menuBar. 
Em seguida, criamos itens de menu usando a classe JMenuItem e menus usando a classe JMenu. 
Adicionamos os itens de menu à barra de ferramentas usando o método add da JToolBar. 
Adicionamos os menus à barra de menus usando o método add da JMenuBar. Definimos o layout do JPanel 
como BorderLayout e adicionamos a barra de ferramentas acima (NORTH) e a barra de menus à esquerda (WEST) do JPanel. 
Por fim, adicionamos o JPanel ao JFrame e configuramos o tamanho do JFrame com base no tamanho preferencial dos 
componentes usando o método pack(). Definimos o comportamento de fechamento e visibilidade do JFrame. 
Ao executar o programa, uma janela com a barra de ferramentas e a barra de menus é exibida. O usuário 
pode interagir com os itens da barra de ferramentas e os menus do programa. */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.BorderLayout;

public class ExemploMenu {
    
    public static void main(String[] args) {
        // Cria uma instância de JFrame
        JFrame frame = new JFrame("Exemplo Toolbar e Menubar");
        
        // Cria um JPanel
        JPanel panel = new JPanel();
        
        // Cria uma JToolBar
        JToolBar toolBar = new JToolBar();
        
        // Cria uma JMenuBar
        JMenuBar menuBar = new JMenuBar();
        
        // Cria os botões da JToolBar
        toolBar.add(new JMenuItem("Novo"));
        toolBar.add(new JMenuItem("Abrir"));
        toolBar.add(new JMenuItem("Salvar"));
        
        // Cria os menus da JMenuBar
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.add(new JMenuItem("Novo"));
        menuArquivo.add(new JMenuItem("Abrir"));
        menuArquivo.add(new JMenuItem("Salvar"));
        
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.add(new JMenuItem("Copiar"));
        menuEditar.add(new JMenuItem("Recortar"));
        menuEditar.add(new JMenuItem("Colar"));
        
        // Adiciona os menus à JMenuBar
        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        
        // Define o layout do JPanel
        panel.setLayout(new BorderLayout());
        
        // Adiciona a JToolBar e a JMenuBar ao JPanel
        panel.add(toolBar, BorderLayout.NORTH);
        panel.add(menuBar, BorderLayout.WEST);
        
        // Adiciona o JPanel ao JFrame
        frame.add(panel);
        
        // Configura o tamanho e a visibilidade do JFrame
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
