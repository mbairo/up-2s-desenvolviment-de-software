import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProgramaPrincipal{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Acao> numLista = new ArrayList<Acao>();
        Acao randomico = new Acao();
        Random random = new Random();

        int pontos = 0;
        int contator = 0;
   
        System.out.println("\nJogo da Memória Genius\n");

        for (int cont = 0; cont < numLista.size(); cont++) {
            int numRandomico = random.nextInt(4)+1;
            numLista.add(numRandomico);       
        }
        while ( pontos >= 0) {            
            try {
                Thread.sleep(1000);
                System.out.println("Número: " + numLista);            
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            int cont;             
            if (numDigitado = numLista(cont)) {
                
            }
        }

    }
}

   //     int numDigitado;

     //   while (numDigitado == numLista ) {
            
       // }
      


        

  




        


