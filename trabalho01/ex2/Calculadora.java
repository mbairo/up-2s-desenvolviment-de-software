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
        
        int opcao;
        int numero1;
        int numero2;

        Scanner scannerOpcao = new Scanner(System.in);

        System.out.println("\n#########################################");
        System.out.println("*Escolha a opção desejada*");
        System.out.println("Digite 1 para soma: ");
        System.out.println("Digite 2 para subração: ");
        System.out.println("Digite 3 para mutiplicação: ");
        System.out.println("Digite 4 para divisão: ");
        System.out.println("Informe qualquer outro caractere para SAIR. ");
        System.out.print("\nOperação: ");

        opcao = scannerOpcao.nextInt();

        
        while (opcao != 0 && opcao < 5) {
            Scanner scannerNumero = new Scanner(System.in);

            System.out.println("\nInforme o primeiro número: ");
            numero1 = scannerNumero.nextInt();
            System.out.println("\nInforme o segundo número: ");
            numero2 = scannerNumero.nextInt();
            
            System.out.println("\n***************************************");
            if (opcao == 1) {
                int resultado = Calculo.soma(numero1, numero2);
                System.out.print("O resultado da soma entre " + numero1 + " e " + numero2 + " é: " + resultado);
            } else if (opcao == 2) {
                int resultado = Calculo.subtracao(numero1, numero2);
                System.out.print("O resultado da subtração entre " + numero1 + " e " + numero2 + " é: " + resultado);
            } else if (opcao == 3) {
                int resultado = Calculo.multiplicacao(numero1, numero2);
                System.out.print("O resultado da multiplicação entre " + numero1 + " e " + numero2 + " é: " + resultado);
            } else if (opcao == 4) {
                double resultado = Calculo.divisao(numero1, numero2);
                System.out.print("O resultado da divisão entre " + numero1 + " e " + numero2 + " é: " +resultado);
            }
            
            System.out.println("\n***************************************");
            System.out.println("\n");

            System.out.println("\n#########################################");
            System.out.println("*Escolha a opção desejada*");
            System.out.println("Digite 1 para soma: ");
            System.out.println("Digite 2 para subração: ");
            System.out.println("Digite 3 para mutiplicação: ");
            System.out.println("Digite 4 para divisão: ");
            System.out.println("Informe qualquer outro caractere para SAIR. ");
            System.out.print("\nOperação: ");
    
            opcao = scannerOpcao.nextInt();
        }
    }
}
