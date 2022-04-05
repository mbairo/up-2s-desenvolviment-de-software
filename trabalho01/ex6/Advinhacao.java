import java.util.Random;
import java.util.Scanner;

public class Advinhacao {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numSorteado = gerador.nextInt(101);
        System.out.println("\nNúmero Ramdômico: " + numSorteado); // para facilitar a correção e testes
        System.out.println("\n*** Acerte o número aleatorio entre 0 e 100 ***");

        Scanner scanner = new Scanner(System.in);
        int i = 10;
        int palpite = 200;
        String dica = "Dica";

        do {
            System.out.println("\n\nVocê tem " + i + " tentativa(s). Qual o seu palpite? ");
            palpite = scanner.nextInt();

            if (palpite >= 0 && palpite <= 100) {
                if (palpite < numSorteado) {
                    dica = "Dica: Número digitado é menor que número sorteado";
                    System.out.println(dica);
                } else if (palpite > numSorteado) {
                    dica = "Dica: Número digitado é maior que número sorteado";
                    System.out.println(dica);
                }

                i -= 1;
            } else {
                System.out.println("ATENÇÃO: Favor informar um número entre 0 e 100");
            }
        } while (palpite != numSorteado && i > 0);

        if (palpite == numSorteado) {
            System.out.println("\nNúmero sorteado: " + numSorteado + "\nVocê acertou, Parabéns!\n");
        } else {
            System.out.println("\n\nVocê não acertou... Não tem chororô, esse jogo acabou!\n"); // referência ao jogo "Hugo"
        }
        scanner.close();
    }
}
