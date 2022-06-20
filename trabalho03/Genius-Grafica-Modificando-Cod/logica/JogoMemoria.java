package logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class JogoMemoria {
    private int[][] tabuleiroNumero;
    

    public JogoMemoria() { 
        tabuleiroNumero = new int[2][2];
        
        // sortear os numeros
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tabuleiroNumero [i] [j] = sortearNumero();
            }
        }
    }

    private int sortearNumero(){
        List<Integer> lista = new ArrayList<Integer>();
        while (true) {
            
            int numeroSorteado = new Random().nextInt(3) + 1;
            Integer num = numeroSorteado;
            
            lista.add(num);
            System.out.println("Lista>>>: " + lista.get(1));
            return numeroSorteado;   
            
        }
    }

    // cria um get para acessar jogo.
    public int[][] getTabuleiroNumero() {
        return tabuleiroNumero;
    }
}
//