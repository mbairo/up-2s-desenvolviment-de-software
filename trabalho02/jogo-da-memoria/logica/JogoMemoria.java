package logica;

import java.util.Random;

public class JogoMemoria {
    private int[][] tabuleiroNumero;

    public JogoMemoria(){
        tabuleiroNumero = new int[4][4];
        // sortear os numeros

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tabuleiroNumero [i] [j] = sortearNumero();
            }
        }
    }

    private int sortearNumero(){
        while (true) {
            int numeroSorteado = new Random().nextInt(8) + 1;
            int contador = 0 ;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (numeroSorteado == tabuleiroNumero[i][j]) {
                        contador++;   
                    }   
                }
            }
            if (contador < 2) {
                return numeroSorteado;   
            }
        }
    }

    // cria um get para acessar  jogo.
    public int[][] getTabuleiroNumero() {
        return tabuleiroNumero;
    }
}
