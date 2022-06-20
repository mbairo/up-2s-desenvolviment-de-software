import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgramaPrincipal{
    public static void main(String[] args) {
        
        System.out.println("\nJogo da Memória Genius\n");

        List<Integer> numLista = new ArrayList<Integer>();
        Random random = new Random();

        for (int cont = 0; cont < 100; cont++) {
            int numRandomico = random.nextInt(4)+1;
            numLista.add(numRandomico);
            long start = System.currentTimeMillis();        
        }

        try {
                
            Thread.sleep(1000);
            System.out.println("Número: " + numLista);
            
          
            
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }


      
        

   //     int numDigitado;

     //   while (numDigitado == numLista ) {
            
       // }
      
        

  




        


    }

}