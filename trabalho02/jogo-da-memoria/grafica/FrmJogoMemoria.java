package grafica;

import javax.swing.JFrame;
import javax.swing.text.TabableView;

import logica.JogoMemoria;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Timer;
public class FrmJogoMemoria extends JFrame {

    // utilizar o BtnPeca que eu criei
    //matri que vai armazenar os botoes
    private BtnPeca [] [] tabuleiro;
    private JogoMemoria jogo;

    public FrmJogoMemoria(){
        //setar propriedades de funcionamento geral

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(new Dimension(400, 400));
        setLocationRelativeTo(null); // setLocation é depois, pois primeiramente é preciso saber o setZise para calcular a posição
        setTitle("Jogo da Memória");
        

        // iniciar logica do jogo
        jogo = new JogoMemoria();

        int [] [] tabuleiroNumero = jogo.getTabuleiroNumero(); // foi criado o jogoMemoria get


        //construção da parte visual
        tabuleiro = new BtnPeca [4][4]; // Linhas e Colunas
        setLayout(new GridLayout (4,4,10,10)); // Linhas Colunas e Margem/pading

        ActionConferir action = new ActionConferir(tabuleiro);

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                BtnPeca btn = new BtnPeca(tabuleiroNumero[i] [j]);// número 5 é teste
                add(btn); // add botaõ no Jframe RootPane
                tabuleiro [i][j] = btn;
                btn.addActionListener(action);
            }
        }
    }

    public void mostarTabuleiro() {

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                tabuleiro [i][j].mostrar();
            }
        }
    }



    
    
    public void ocultarTabuleiro() {

        for (int i = 0; i<4; i++ ){
            for (int j = 0; j< 4 ; j++){
                tabuleiro [i][j].ocultar();
            }
        }
    }



}