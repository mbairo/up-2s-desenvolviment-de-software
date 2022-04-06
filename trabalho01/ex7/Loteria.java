import java.util.Scanner;
import java.util.Random;

public class Loteria{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int [] numerosEscolhidos = new int[6];
        int contador = 0;

        do {
            System.out.print("\n\nFavor informar o "+ (contador + 1) +"° número da sorte (palpite): ");
            int numInformado = scanner.nextInt();

            if (numInformado > 0 && numInformado <= 60) {

                numerosEscolhidos[contador] = numInformado;
                contador++;
            } else {
                System.out.println("ATENÇÃO: Favor informar um número entre 0 e 60");
            }

        } while (contador < numerosEscolhidos.length);

        System.out.println("\n************************************\nSeus números escolhidos foram: ");

        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.print(+numerosEscolhidos[i]+ "    ");
        }

        System.out.println("\n\n\n");

        Random gerador = new Random();
        int [] dezenas = new int[6];

        System.out.println("Os números sorteados foram: ");

        for (int i = 0; i < dezenas.length; i++) {
            dezenas[i] = gerador.nextInt(60)+1;
            System.out.print(dezenas[i] + "    ");
        }
        System.out.println("\n************************************\n");

        int quantidadeDeAcertos = 0;

         for (int i = 0; i < numerosEscolhidos.length; i++) {
             for (int j = 0; j < dezenas.length; j++) {
                 if (numerosEscolhidos[i] == dezenas[j]) {
                    quantidadeDeAcertos++;
                    break;
                 }
            }
         }

         if (quantidadeDeAcertos == 6) {
            System.out.println("Parabéns você ganhou R$ 1.000.000,00");
         } else if (quantidadeDeAcertos == 5) {
            System.out.println("Parabéns você ganhou R$ 250.000,00");
         } else if (quantidadeDeAcertos == 4) {
            System.out.println("Parabéns você ganhou R$ 50.000,00");
         } else {
            System.out.println("Você não ganhou nada!");
         }
         System.out.println("\n");
    }
}
