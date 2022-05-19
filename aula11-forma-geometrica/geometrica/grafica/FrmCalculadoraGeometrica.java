package grafica;
import java.awt.*;
import javax.swing.*;
import grafica.ActionCalcularArea.OpcaoForma;

public class FrmCalculadoraGeometrica extends JFrame {

    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;

    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;

    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;

    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;

//construtora
    public FrmCalculadoraGeometrica(){
        setSize(new Dimension(720, 230));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new GridLayout(3, 1, 10, 10)); // Outra forma de se fazer
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));


//Círculo
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Círculo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        pnl.add(new JLabel("Raio: "));
        txtCircunferenciaRaio = new JTextField(10);
        pnl.add(txtCircunferenciaRaio); // precisa?

        btnCircunferenciaCalcularArea = new JButton("Calcular");
        pnl.add(btnCircunferenciaCalcularArea);

        pnl.add(new JLabel("Área: "));
        txtCircunferenciaArea = new JTextField(10);
        pnl.add(txtCircunferenciaArea);

//Retângulo
        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retângulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
        pnl.add(new JLabel("Base: "));
        txtRetanguloBase = new JTextField(10);
        pnl.add(txtRetanguloBase);

        pnl.add(new JLabel("Altura: "));
        txtRetanguloAltura = new JTextField(10);
        pnl.add(txtRetanguloAltura);

        btnRetanguloCalcularArea = new JButton("Calcular");
        pnl.add(btnRetanguloCalcularArea);

        pnl.add(new JLabel("Área: "));
        txtRetanguloArea = new JTextField(10);
        pnl.add(txtRetanguloArea);


//Triângulo

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triângulo"));
        add(pnl);

        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
        pnl.add(new JLabel("Base: "));
        txtTrianguloBase = new JTextField(10);
        pnl.add(txtTrianguloBase);

        pnl.add(new JLabel("Altura: "));
        txtTrianguloAltura = new JTextField(10);
        pnl.add(txtTrianguloAltura);
  
        btnTrianguloCalcularArea = new JButton("Calcular");

        pnl.add(btnTrianguloCalcularArea); // faltava
        pnl.add(new JLabel("Área: "));
        txtTrianguloArea = new JTextField(10);
        pnl.add(txtTrianguloArea);

        pack(); // pack = Ajustes na parte grafica 

        ActionCalcularArea 
        action = new ActionCalcularArea(txtCircunferenciaRaio, OpcaoForma.CIRCULO, txtCircunferenciaArea);
        btnCircunferenciaCalcularArea.addActionListener(action);

        action = new ActionCalcularArea(txtRetanguloBase, txtRetanguloAltura, OpcaoForma.RETANGULO, txtRetanguloArea);
        btnRetanguloCalcularArea.addActionListener(action);

        action = new ActionCalcularArea(txtTrianguloBase, txtTrianguloAltura, OpcaoForma.TRIANGULO, txtTrianguloArea);
        btnTrianguloCalcularArea.addActionListener(action);   
    }
}
