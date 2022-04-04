import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o termo da sequência que deseja verificar: "); // n-ésimo
        int termo = scanner.nextInt();

        int resultado = 0;

        int penultimo = 0;
        int atual = 1;

        if (termo > 0) {

            for (int i = 2; i < termo; i++) {
                resultado = atual + penultimo;
                penultimo = atual;
                atual = resultado;
            }
            System.out.println("O resultado é : " + resultado);
        }
        scanner.close();
    }
}
/// está dando erro quanto ao 1° e 2° termo da sequência e não está filtrando por inteiro ... termo % 2 = 0