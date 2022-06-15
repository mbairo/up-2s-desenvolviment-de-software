package grafica;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;


public class FrmCalculadoraSimples extends JFrame {
    private JTextField txtx, txty;
    private JComboBox<String> cbxOperacao;
    private JButton btnCalcular;
    
    //construtora
    public FrmCalculadoraSimples(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // da esquerda para a direita 
        setLocationRelativeTo(null); // centro da tela 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // quando clicar no x
        setSize(new Dimension(320, 120));
        
        //componentes
        add(new JLabel("x:"));
        add(txtx = new JTextField(10));
        
        add(new JLabel("y:"));
        add(txty = new JTextField(10));

        //vetor para carregar o combobox
        String operacoes[] = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        add(new JLabel("Operações:"));
        add(cbxOperacao = new JComboBox<String>(operacoes)); // vai guardar itens do tipo string
        add(btnCalcular = new JButton("Calcular"));

        // Criar e vincular a action ao botão
        ActionCalcular action = new ActionCalcular(txtx, txty, cbxOperacao);
        btnCalcular.addActionListener(action);
    }
}

//