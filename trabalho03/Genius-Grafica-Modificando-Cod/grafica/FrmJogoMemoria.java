package grafica;
import javax.swing.JFrame;
import logica.JogoMemoria;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
public class FrmJogoMemoria extends JFrame {

    // utilizar o BtnPeca que eu criei
    //matriz que vai armazenar os botoes
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
        
       
        //construção da parte visual.
        tabuleiro = new BtnPeca [2][2];
        setLayout(new GridLayout (2,2,5,5));
        ActionConferir action = new ActionConferir(tabuleiro);

        BtnPeca btnVerde = new BtnPeca(tabuleiroNumero[0] [0]);
        add(btnVerde); // add botaõ no Jframe RootPane
        tabuleiro [0][0] = btnVerde;
        btnVerde.addActionListener(action);
        btnVerde.setBackground(Color.green);

        BtnPeca btnAmarelo = new BtnPeca(tabuleiroNumero[0] [1]);
        add(btnAmarelo); // add botaõ no Jframe RootPane
        tabuleiro [0][1] = btnAmarelo;
        btnAmarelo.addActionListener(action);
        btnAmarelo.setBackground(Color.yellow);

        BtnPeca btnVermelho = new BtnPeca(tabuleiroNumero[1] [0]);
        add(btnVermelho); // add botaõ no Jframe RootPane
        tabuleiro [0][0] = btnVermelho;
        btnVermelho.addActionListener(action);
        btnVermelho.setBackground(Color.red);

        BtnPeca btnAzul = new BtnPeca(tabuleiroNumero[1] [1]);
        add(btnAzul); // add botão no Jframe RootPane
        tabuleiro [0][1] = btnAzul;
        btnAzul.addActionListener(action);
        btnAzul.setBackground(Color.blue);
    }

    public void mostarTabuleiro() {
        for (int i = 0; i<2; i++ ){
            for (int j = 0; j< 2 ; j++){
                tabuleiro [i][j].mostrar();
            }
        }
    }
    
    public void ocultarTabuleiro() {

        for (int i = 0; i<2; i++ ){
            for (int j = 0; j< 2 ; j++){
                tabuleiro [i][j].ocultar();
            }
        }
    }
}