import java.util.Random;
import java.util.Scanner;

public class Advinhacao {

    public static void main(String[]args) {
        Random gerador = new Random();
        int numSorteado = gerador.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {

        System.out.println("\nVocê tem tentativa(s). Qual o seu palpite? ");
        int palpite = scanner.nextInt();

        i += 1;

        } while (palpite != numSorteado || i < 10);

        if( palpite == numSorteado){
            System.out.println("Você acertou, Parabéns!");
        } else
            System.out.println("Não tem chororô, esse jogo acabou!");
        }
        scanner.close();
    }
    
}