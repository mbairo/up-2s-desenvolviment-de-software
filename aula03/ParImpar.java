import java.util.Scanner;

public class ParImpar;{
// Atributos e propriedades

// Funções e procedimento
public static String VerificaParIpar(int n);{
    if (n % 2 == 0){
        return "Par"
    }else{
        return "Impar";
    }
}
    // Funcao principal
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        // Codigo
        do{
            n = teclado.nextInt();
            if (n >= 0){
                System.out.println(verificarParImpar(n));    
            }
        } while (n >= 0);
        teclado.close();
    }

}