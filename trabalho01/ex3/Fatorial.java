import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número positivo para calcular seu fatorial");
        int num = scanner.nextInt();

        int resultado;
        resultado = num;
        
        if (num <0) {
            System.out.println("Erro... Favor informar um número positivo!");           
        } else {
            for (int i = num; i > 2; i--) {
                     resultado = resultado * (i -1);           
            }
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }   
}
