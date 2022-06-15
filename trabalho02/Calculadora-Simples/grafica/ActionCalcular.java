package grafica;
 
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.Calculadora;

public class ActionCalcular extends AbstractAction {
    private JTextField txtx, txty;
    private JComboBox<String> cbxOperacao;

    public ActionCalcular(JTextField txtx, JTextField txty, JComboBox<String>cbxOperacao){
        this.txtx = txtx;
        this.txty = txty;
        this.cbxOperacao = cbxOperacao;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        double x = Double.parseDouble(txtx.getText()); // parseDOUBLE de String para double.
        double y = Double.parseDouble(txty.getText());
        Calculadora calc = new Calculadora(x, y);

        if (cbxOperacao.getSelectedItem().equals("Soma")) { 
            JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f + %.2f é %.2f", x, y, calc.somar()), "Calculadora simples", JOptionPane.INFORMATION_MESSAGE); // INFORMATION é um icone no caso "i"
        } 
        if (cbxOperacao.getSelectedItem().equals("Subtração")) { 
            JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f - %.2f é %.2f", x, y, calc.subtrair()), "Calculadora simples", JOptionPane.INFORMATION_MESSAGE); // INFORMATION é um icone no caso "i"
        } 
        if (cbxOperacao.getSelectedItem().equals("Multiplicação")) { 
            JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f x %.2f é %.2f", x, y, calc.multiplicar()), "Calculadora simples", JOptionPane.INFORMATION_MESSAGE); // INFORMATION é um icone no caso "i"
        } 
        if (cbxOperacao.getSelectedItem().equals("Divisão")) { 
            JOptionPane.showMessageDialog(null, String.format("O resultado de %.2f x %.2f é %.2f", x, y, calc.dividir()), "Calculadora simples", JOptionPane.INFORMATION_MESSAGE); // INFORMATION é um icone no caso "i"
        }

        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Favor informar apenas números!", "Erro!!!",JOptionPane.ERROR_MESSAGE);
        }
    }
}
