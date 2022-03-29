import java.lang.annotation.Repeatable;
import java.util.Random;

public class Sorteio {
    
    // Funções e procedimentos

    // Rotina principal

    public static void main(String[] args){
        Random gerador = new Random(); // Random é a classe - gerador é a variavel  e new Random é o objeto ---- gerador recebe o objeto new Random
        int c = 1;
        int soma = 1;
        int maior = 1;
        int menor = 100;
        
        while(c <= 1000) { // enquanto contador for menor que 1k
            // ler o numero
            int n = 1 + gerador.nextInt(100); // sorteia números de 1 até 100
            c++; // c+= 1 ou c = c + 1
            System.out.println(n);

            soma = soma + n;

            if (maior < n) {
                maior = n;
            }
            if (menor > n) {
                menor = n;
            }
        }
        
        System.out.println("Soma = " + soma);
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Média = " + soma / 1000f); // ou soma / (float) 1000; <<< name Type Cast "Conversão de Tipos" entre tipos primitivos
    }
}

