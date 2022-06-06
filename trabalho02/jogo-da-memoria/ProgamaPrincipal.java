import java.net.FileNameMap;

import grafica.FrmJogoMemoria;

public class ProgamaPrincipal {
    public static void main(String[] args) {
        FrmJogoMemoria frm= new FrmJogoMemoria();
        frm.setVisible(true);
        frm.mostarTabuleiro();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        frm.ocultarTabuleiro();
    }   
}
