import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	static List<Contatos> listaDeContatos = new ArrayList<Contatos>();
	private static Scanner scanner = new Scanner(System.in);
	private static Contatos agenda = new Contatos();
 
	public static void main(String[] args) {	
		int opc = 100;
				
	do {
		System.out.print("\n*** Cadastro/Agenda ****\n");
            System.out.print("1 - Cadastrar nova pessoa\n2 - Editar\n3 - Remover Contato\n4 - Mostra Contatos\n0 - Sair\nDigite a opção desejada: ");
            opc = scanner.nextInt();			
			
			switch (opc) {		
				case 1: // Alimenta Lista

					System.out.print("\nNome: ");
                    String nome = scanner.next();
                    System.out.print("\nRg: ");
                    int rg = scanner.nextInt();
                    System.out.print("\nData de Nascimento: ");
                    String dataNascimento = scanner.next();

                    System.out.print("\nE-mail (Principal): ");
                    String emailPrincipal = scanner.next();
                    System.out.print("\nE-mail (Secundário): ");
                    String emailSecundario = scanner.next();

                    System.out.print("\nTelefone (Residencial): ");
                    int telefoneResidencial = scanner.nextInt();
                    System.out.print("\nTelefone (Comercial):  ");
                    int telefoneComercial = scanner.nextInt();
                    System.out.print("\nTelefone (Celular):  ");
                    int telefoneCelular = scanner.nextInt();

                    System.out.print("\nEndereço (Residencial): ");
                    String enderecoResidencial = scanner.next();
                    System.out.print("\nEndereço (Comercial): ");
                    String enderecoComercial = scanner.next();
                    
					Contatos contato = Contatos.salvaNaAgenda(nome, rg, dataNascimento, emailPrincipal, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial);
					agenda.salvaContato(contato);
					listaDeContatos.add(new Contatos(nome, rg, dataNascimento, emailPrincipal, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial));                         
					break;
					
				case 2: // Edita
					System.out.print("Informe o nome da pessoa que deseja editar os dados: ");
					String nomeParaEditar = scanner.next();
					Contatos buscaContato = agenda.localizaNaAgenda(nomeParaEditar);

					System.out.print("\n*** Informe os novos Dados ***\n");
					System.out.print("\nNome: ");
                    String novoNome = scanner.next();
                    System.out.print("\nRg: ");
                    int novoRg = scanner.nextInt();
                    System.out.print("\nData de Nascimento: ");
                    String novaDataNascimento = scanner.next();

                    System.out.print("\nE-mail (Principal): ");
                    String novoEmailPrincipal = scanner.next();
                    System.out.print("\nE-mail (Secundário): ");
                    String novoEmailSecundario = scanner.next();

                    System.out.print("\nTelefone (Residencial): ");
                    int novoTelefoneResidencial = scanner.nextInt();
                    System.out.print("\nTelefone (Comercial): ");
                    int novoTelefoneComercial = scanner.nextInt();
                    System.out.print("\nTelefone (Celular): ");
                    int novoTelefoneCelular = scanner.nextInt();

                    System.out.print("\nEndereço (Residencial): ");
                    String novoEnderecoResidencial = scanner.next();
                    System.out.print("\nEndereço (Comercial): ");
                    String novoEnderecoComercial = scanner.next();
					
					Contatos contatoAtualizado = Contatos.salvaNaAgenda(novoNome, novoRg, novaDataNascimento, novoEmailPrincipal, novoEmailSecundario, novoTelefoneResidencial, novoTelefoneComercial, novoTelefoneCelular, novoEnderecoResidencial, novoEnderecoComercial);
					agenda.atualiza(buscaContato, contatoAtualizado);	
					break;

				case 3: // Remover
					System.out.print("     Atenção!\nEssa ação é irreversível!");
					System.out.print("\nInforme o nome da pessoa que deseja remover:");
					String nomeParaRemover = scanner.next();
					Contatos remover = agenda.localizaNaAgenda(nomeParaRemover);		
					agenda.removeContato(remover);
					break;
					
				case 4: // Mostra lista
				System.out.println("\n**********************************************");
					System.out.print("  Todos os Contatos Salvos e Atualizados");
					agenda.mostraLista();
					System.out.print("**************Fim da Tabela**************\n");
					break;		 
			}
		} while (opc !=0);
	}
}