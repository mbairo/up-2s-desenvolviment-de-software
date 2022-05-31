import java.util.Scanner;

public class ConsoleUtils{
    public static int lerInteiro(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        
        while (true){ 
            String linhaDIgitada = input.next();
            try{
                int num = Integer.parseInt(linhaDIgitada);
                input.close();
                return num;
            } catch (NumberFormatException ex) {
                System.out.println("Valor informado não é um número interiro valido! Tente novamente.");
                //System.out.println(ex.getMessage());
                //ex.printStackTrace();
            }
        }
    }
}


