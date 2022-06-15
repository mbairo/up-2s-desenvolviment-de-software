package grafica;

import java.awt.event.ActionEvent;
import java.util.Timer;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class ActionConferir extends AbstractAction{ // ele "herda action performace "clique do botão"
    private boolean aguardando;
    private BtnPeca primeiraPeca;
    private BtnPeca[][] tabuleiro;
    private int pontuacao;
    private int erros;

    public ActionConferir(BtnPeca[][] tabuleiro ){
        this.tabuleiro = tabuleiro;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // TODO Auto-generated method stub.
        
        BtnPeca pecaAtual = (BtnPeca) e.getSource();
        if (aguardando){
            // estado aguardando
            //logica para conferir o valor das pecas 
            // conferir se é fim de jogo

            if (primeiraPeca == pecaAtual) {
                pecaAtual.mostrar(); // deixar selecionado o primeiro click.
                return;
            }

            if (pecaAtual.getNumero() == primeiraPeca.getNumero()) {
                // condição de acerto
                pontuacao += 5;
                pecaAtual.mostrar();
                pecaAtual.setEnabled(false); // para desabilitar as certas
                primeiraPeca.setEnabled(false); // desabilitar as certas

                //conferir fim de jogo
                int contador = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (tabuleiro[i][j].isSelected()) {
                            contador++;
                        }   
                    }
                }
                if (contador == 16) {
                    JOptionPane.showMessageDialog(null, String.format("Fim de jogo! Pontuação: %d \nErros: %d", pontuacao, erros), "*Jogo da memoria*", JOptionPane.INFORMATION_MESSAGE);

                } 
            } else {
                    // condição de erro
                    pontuacao -= 3; 
                    erros += 1;
                    new Thread() {
                        public void run() {
                            pecaAtual.mostrar();
                            try{
                                Thread.sleep(1000);
                            }catch(InterruptedException ex){
                                ex.printStackTrace();
                            }
                            pecaAtual.ocultar();
                            primeiraPeca.ocultar();
                        };
                    }.start();
                }
                aguardando = false;
                
        } else {
            //estado parado
            primeiraPeca = pecaAtual;
            primeiraPeca.mostrar();
            aguardando = true;
        }
    }
}
