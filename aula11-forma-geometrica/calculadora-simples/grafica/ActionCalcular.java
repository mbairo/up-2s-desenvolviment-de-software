package grafica;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Calculadora;

public class ActionCalcular extends AbstractAction {
    private JTextField txtx, txty;
    private JComboBox<String> cbxOperacao;
    public ActionCalcular(JTextField txtx, JTextField txty, JComboBox<String>
    bcxOperacao){
        this.txtx = txtx;
        this.txty = txty;
        this.cbxOperacao = cbxOperacao;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double x = Double.parseDouble(txtx.getText()); // PARSEDOUBLE DE STRING PARA DOUBLE 
        double y = Double.parseDouble(txty.getText());
        Calculadora calc = new Calculadora(x, y);
        if (cbxOperacao.getSelectedItem().equals("Soma")){
            JOptionPane.showMessageDialog(null, String.format("O resultado de %f + %f é %f",x, y, calc.somar()), "Calculadora simples", JOptionPane.INFORMATION_MESSAGE); // INFORMATION é um icone no caso "i"
        } // FAZER PARA AS DE
    }
    
}
