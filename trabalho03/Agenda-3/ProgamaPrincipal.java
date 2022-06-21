import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProgamaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> listaDeContatos = new ArrayList<Contato>();
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
                    String emailPrincipal = scanner.next();
                    System.out.println("E-mail (Secundário): \n");
                    String emailSecundario = scanner.next();

                    System.out.println("Telefone (Residencial):  \n");
                    int telefoneResidencial = scanner.nextInt();
                    System.out.println("Telefone (Comercial):  \n");
                    int telefoneComercial = scanner.nextInt();
                    System.out.println("Telefone (Celular):  \n");
                    int telefoneCelular = scanner.nextInt();

                    System.out.println("Endereço (Residencial):  \n");
                    String enderecoResidencial = scanner.next();
                    System.out.println("Endereço (Comercial):  \n");
                    String enderecoComercial = scanner.next();
                    
                    listaDeContatos.add(new Contato(nome, rg, dataNascimento, emailPrincipal, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial));                         
                    break;      
                case 2:
                    System.out.println("Informe o nome da pessoa que deseja editar os dados: ");
                    String nomeParaEditar = scanner.next();

                    System.out.println("Informe o novo nome: ");
                    String novoNome = scanner.next();
                    for (int i = 0; i < listaDeContatos.size(); i++) {
                        if (listaDeContatos.get(i).getNome().equals(nomeParaEditar)) {
                            listaDeContatos.get(i).setNome(novoNome);
                           
                        }
                    }
               

                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("*** Lista de Contatos *** \n");
                    for (Contato mostraContatos : listaDeContatos) {

                    System.out.println(mostraContatos);                    
                    }
                    break;
          
            }
        } while (option != 0);
     }
 }