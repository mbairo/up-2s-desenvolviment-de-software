import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

// erro ao digitar o nome, se digitar só números dá mais ou menos certo... arrumar depois
public class NotaFinalArray{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int [][] arrayAlunos = new int[3][4];
        int nota1 = 0;
        int nota2 = 0;
        int notaFinal = 0;

        for(int linha = 0; linha < arrayAlunos.length; linha++) {

            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < arrayAlunos[linha].length; coluna++) { 

                if (coluna == 0) {
                    System.out.println("\n\nInforme sua matricula: ");
                    arrayAlunos[linha][coluna] = scanner.nextInt();                    
                } else if (coluna == 1){
                    System.out.println("\n\nInforme seu nome: ");
                    arrayAlunos[linha][coluna] = scanner.nextInt();   
                } else if (coluna == 2){
                    System.out.println("\n\nInforme a primeira nota: ");
                    arrayAlunos[linha][coluna] = scanner.nextInt();             
                } else if (coluna == 3){
                    System.out.println("\n\nInforme a segunda nota: ");
                    arrayAlunos[linha][coluna] = scanner.nextInt();             
                } else {
                    notaFinal = (nota1 + nota2) /2;
                    if (notaFinal >= 6) {
                        arrayAlunos[linha][coluna] = 10;
                    } else {
                        arrayAlunos[linha][coluna] = 0;
                    }
                    
                }
            }
        }

        for(int linha = 0; linha < arrayAlunos.length; linha++) {

            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( int coluna = 0; coluna < arrayAlunos[linha].length; coluna++) { 

                if (coluna == 0) {
                    System.out.println(arrayAlunos[linha][coluna]);                 
                } else if (coluna == 1){
                    System.out.println(arrayAlunos[linha][coluna]);    
                } else if (coluna == 2){
                    System.out.println(arrayAlunos[linha][coluna]);              
                } else if (coluna == 3){
                    System.out.println(arrayAlunos[linha][coluna]);              
                } else {
                    System.out.println(arrayAlunos[linha][coluna]);  
                }
            }
        }

    }

}







