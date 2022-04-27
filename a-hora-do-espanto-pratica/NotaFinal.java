import java.util.Scanner;

// ▪ Criar um programa para processar as seguintes informações de um aluno:
// matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
// ▪ Durante a execução calcular a nota final do aluno utilizando a seguinte
// regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a
// 6 o aluno está aprovado, caso contrário estará reprovado;
// ▪ O programa deverá imprimir o seguinte relatório:
// Matrícula: xxxxx
// Nome: xxxxx xxxxx
// Aprovado: ( x ) Sim ( ) Não
// Nota final: xxxxx


public class NotaFinal{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nInforme sua matricula: ");
        int matricula = scanner.nextInt();


        System.out.println("\n\nInforme seu nome: ");
        String teste = scanner.nextLine();   // Gambiarra para conseguir ler nome composto ou sobrenome
        String nome = scanner.nextLine();

        System.out.println("\n\nInforme a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("\n\nInforme a segunda nota: ");
        int nota2 = scanner.nextInt();

        
        float notaFinal = (nota1 + nota2) /2;

        if (notaFinal >= 6) {
            System.out.println("Matrícula: "+ matricula);
            System.out.println("Nome: "+ nome);
            System.out.println("Aprovado: ( x ) Sim ( ) Não");
            System.out.println("Nota final: " + notaFinal);
        } else {
            System.out.println("Matrícula: "+ matricula);
            System.out.println("Nome: "+ nome);
            System.out.println("Aprovado: (  ) Sim ( x ) Não");
            System.out.println("Nota final: " + notaFinal);
        }
    }
}


