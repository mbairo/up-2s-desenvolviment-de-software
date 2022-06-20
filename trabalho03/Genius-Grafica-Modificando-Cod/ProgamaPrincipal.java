
import java.util.Random;
import logica.JogoMemoria;
import grafica.FrmJogoMemoria;

public class ProgamaPrincipal extends JogoMemoria{
    public static void main(String[] args) {
        FrmJogoMemoria frm = new FrmJogoMemoria();
        frm.setVisible(true);
        
        Random geraCor = new Random();
        System.out.println(geraCor.nextInt(3));


        int [] randomNumbers = new int [3];
        for (int cont = 0; cont < randomNumbers.length; cont++) {
            randomNumbers[cont] = ramdom(cont);
            System.out.println("Aqui> "+randomNumbers);
        }



        frm.mostarTabuleiro();
        try {            
            Thread.sleep(1000);
            
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        frm.ocultarTabuleiro();     
    }

    private static int ramdom(int i) {
        return 0;
    }
    
}
//