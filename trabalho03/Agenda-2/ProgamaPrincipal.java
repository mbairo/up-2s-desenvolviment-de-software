import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProgamaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> listaDeContatos = new ArrayList<Contato>();
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        int option = 100;
   
        
        do {
            System.out.print("*** Cadastro/Agenda ****\n");
            System.out.println("1 - Cadastrar nova pessoa\n 2 - Editar\n 3 - Remover Contato\n 4 - Mostra Contatos\n 0 - Sair");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Nome: \n");
                    String nome = scanner.next();
                    System.out.print("Rg: \n");
                    int rg = scanner.nextInt();
                    System.out.print("Data de Nascimento: \n");
                    String dataNascimento = scanner.next();

                    System.out.println("E-mail (Principal): \n");
                    String email = scanner.next();
                    hm.put(1, email);
                


                    listaDeContatos.add(new Contato(nome +"\n",  rg, dataNascimento));    
                     
                    break;      
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("*** Lista de Contatos *** \n"+ listaDeContatos + "\n");
                    for (Contato mostraContatos : listaDeContatos) {

                    System.out.println(mostraContatos);
                    System.out.printf("Email: ", hm.get(1));
                    }
                    break;
                default:
                    System.out.println("Favor informar apenas números!");          
            }
        } while (option != 0);
     }
 }