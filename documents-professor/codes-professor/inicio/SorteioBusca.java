import java.util.Random;
import java.util.Scanner;

public class SorteioBusca {
    // Atributos
    public static Scanner teclado;
    public static int[] vetor;

    // Funções e procedimentos
    public static void sortear() {
        Random gerador = new Random();
        int num;
        vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            // impede que haja repeticao de numero
            do {
                num = gerador.nextInt(100) + 1;
            } while (procurar(num) > 0);
            vetor[i] = gerador.nextInt(100) + 1;
        }
    }

    public static int procurar(int n) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // Rotina principal
    public static void main(String[] args) {
        sortear();
        teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = teclado.nextInt();
        int pos = procurar(num);
        if (pos >= 0) {
            System.out.printf("Número encontrado na posição %d", pos);
        } else {
            System.out.println("Número não encontrado");
        }
        teclado.close();
    }
}
