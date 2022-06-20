package grafica;
import javax.swing.JButton;
public class BtnPeca extends JButton{

    private int numero;

    //setBackground(color.red)
    public BtnPeca(int numero) {
        //setBackground(color.white);
        this.numero = numero;
    }

    public void mostrar() {
        setSelected(true);
        setText(Integer.toString(numero));
    }

    public void ocultar() {
        setSelected(false);
        setText("");
    }

    public int getNumero() {
        return numero;
    }
}
//