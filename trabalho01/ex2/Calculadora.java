import java.util.Scanner;

class Calculo {

    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double divisao(int numero1, int numero2) {
        return ((double) numero1 / numero2);
    }

}

public class Calculadora {

    public static void main(String[] args) {

        // declara varíaveis
        int opcao;
        int numero1;
        int numero2;

        // mostar opções para o usuário
        Scanner input = new Scanner(System.in);
        System.out.println("*Escolha a opção desejada*");
        System.out.println("Digite 1 para soma: ");
        System.out.println("Digite 2 para subração: ");
        System.out.println("Digite 3 para mutiplicação: ");
        System.out.println("Digite 4 para divisão: ");
        System.out.println("0. Sair");
        System.out.println("Operação: ");

        // Lê a opção escolhida
        opcao = input.nextInt();
        
        while (opcao != 0 && opcao < 5) {
            Scanner input1 = new Scanner(System.in);

            System.out.println("Informe o primeiro número: ");
            numero1 = input1.nextInt();
            System.out.println("Informe o segundo número: ");
            numero2 = input1.nextInt();

            
            if (opcao == 1) {
                int resultado = Calculo.soma(numero1, numero2);
                System.out.printf("\nO resultado da soma é: %d\n", resultado);
            } else if (opcao == 2) {
                int resultado = Calculo.subtracao(numero1, numero2);
                System.out.printf("\nO resultado da subtração é: %d\n", resultado);
            } else if (opcao == 3) {
                int resultado = Calculo.multiplicacao(numero1, numero2);
                System.out.printf("\nO resultado da multiplicação é: %d\n", resultado);
            } else if (opcao == 4) {
                double resultado = Calculo.divisao(numero1, numero2);
                System.out.println(resultado);
                // System.out.printf("\nO resultado da subtração é: %d\n", resultado);
            }

        }
    }

}
