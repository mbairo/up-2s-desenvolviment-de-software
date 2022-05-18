package grafica;

import java.awt.*;

import javax.swing.*;

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
        setSize(new Dimension(720, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));


//Circulo
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 5, 10, 50));
        pnl.add(new JLabel("Raio: "));
        txtCircunferenciaRaio = new JTextField();
        pnl.add(txtCircunferenciaRaio);

        btnCircunferenciaCalcularArea = new JButton("Calcular");
        pnl.add(btnCircunferenciaCalcularArea);

        pnl.add(new JLabel("Área: "));
        txtCircunferenciaArea = new JTextField();
        pnl.add(txtCircunferenciaArea);

//Retângulo
        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retângulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 5, 10, 50)); // linhas, colunas e margim ***Verificar
        pnl.add(new JLabel("Base: "));
        txtRetanguloBase = new JTextField();
        pnl.add(txtRetanguloBase);

        pnl.add(new JLabel("Altura: "));
        txtRetanguloAltura = new JTextField();
        pnl.add(txtRetanguloAltura);

        btnRetanguloCalcularArea = new JButton("Calcular");
        pnl.add(btnRetanguloCalcularArea);


        pnl.add(new JLabel("Área: "));
        txtRetanguloArea = new JTextField();
        pnl.add(txtRetanguloArea);

//Triângulo

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triângulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 5, 10, 50)); // linhas, colunas e margim ***Verificar
        pnl.add(new JLabel("Base: "));
        txtTrianguloBase = new JTextField();
        pnl.add(txtTrianguloBase);

        pnl.add(new JLabel("Altura: "));
        txtTrianguloAltura = new JTextField();
        pnl.add(txtTrianguloAltura);

        btnTrianguloCalcularArea = new JButton("Calcular");
        pnl.add(btnTrianguloCalcularArea);

        pnl.add(new JLabel("Área: "));
        txtTrianguloArea = new JTextField();
        pnl.add(txtTrianguloArea);
        
    }
}
