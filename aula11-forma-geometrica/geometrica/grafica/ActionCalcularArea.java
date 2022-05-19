package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import logica.Circulo;
import logica.Retangulo;
import logica.Triangulo;


public class ActionCalcularArea extends AbstractAction {
    public enum OpcaoForma{
        CIRCULO,
        TRIANGULO,
        RETANGULO
        
    }
    
    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private OpcaoForma opcaoForma;

    //contrutora
    public ActionCalcularArea(JTextField txtRaio, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtRaio = txtRaio;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;
    }

    public ActionCalcularArea(JTextField txtBase, JTextField txtAltura,
    OpcaoForma opcaoForma, JTextField txtArea){
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        switch (this.opcaoForma) {
            case CIRCULO:
                double raio = Double.parseDouble(txtRaio.getText());
                Circulo circulo = new Circulo(raio);
                double area = circulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;

            case RETANGULO:
                double base = Double.parseDouble(txtBase.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                Retangulo retangulo = new Retangulo(base, altura);
                area = retangulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;  

            case TRIANGULO:
                base = Double.parseDouble(txtBase.getText());
                altura = Double.parseDouble(txtAltura.getText());
                Triangulo triangulo = new Triangulo(base, altura);
                area = triangulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;                
        }
    }
}
