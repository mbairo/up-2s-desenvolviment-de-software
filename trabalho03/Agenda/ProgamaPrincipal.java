import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

public class ProgamaPrincipal {
    public static void main(String[] args) {
        // instancia uma Lista de Pessoa 
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
  
        // Alimenta Lista
        pessoas.add(new Pessoa("Marcos", 125045040, "17/10/19490"));
        pessoas.add(new Pessoa("Dostoiévski", 101670658, "11/09/1821"));
        pessoas.add(new Pessoa("C.S.Lewis", 230356087, "29/09/1898"));
        
        // Ordem Alfabética
        Collections.sort(pessoas);
        System.out.println("\n*** Lista de Pessoas ***");
        for (Pessoa mostraPessoa : pessoas) {
            System.out.println(mostraPessoa);
        }

        // Remove contato
        for(int i = 0; i < pessoas.size(); i++)
        {
            Pessoa deletar = pessoas.get(i);
    
            if(deletar.getNome().equals("Marcos"))
            {
                pessoas.remove(deletar);
                break;
            }
        }     

        // Verifica remoção
        Collections.sort(pessoas);
        System.out.println("\n*** Lista de Pessoas Atualizada ***");
        for (Pessoa mostraPessoa : pessoas) {
            System.out.println(mostraPessoa);
        }

        // criar nova pessoa
        Pessoa p = new Pessoa("Orwell", 345678458,"25/06/1903");
        // pessoas.add(new Pessoa("Orwell", 345678458,"25/06/1903"));
       
        // E-mail
        p.getEmail().put("principal", "principal.aldo@gmail.com");
        p.getEmail().put("secundário", "secundario.aldo@gmail.com");
        System.out.println("\nE-mail selecionado: ");
        System.out.printf("E-mail: %s \n", p.getEmail().get("secundário"));
        
        // Telefones
        p.getTelefones().put("residencial", "41 3264-3273");
        p.getTelefones().put("comercial", "41 3234-3276");
        p.getTelefones().put("celular", "41 99343-3273");
        System.out.println("\nTelefone Selecionado:");
        System.out.printf("Telefone: %s \n", p.getTelefones().get("comercial"));

        // Classe Endereco //
        // Endereços
        List<Endereco> enderecos = new ArrayList<Endereco>();
        // Adiciona endereços
        enderecos.add(new Endereco("R. Homero", 32, "Casa", "Grecia Antiga", 80820590, "Jônia"));
        enderecos.add(new Endereco("R. Victor Hugo", 77, "Casa", "Passo deCalais", 20820590, "Montreuil"));
        enderecos.add(new Endereco("R. Assimov", 7, "Chalé", "SanFord", 558207650, "Flórida"));

        // Mostra endereços
        System.out.println("\n*** Lista de Endereços ***");
        for (Endereco mostraEndereco : enderecos) {
            System.out.println(mostraEndereco);
        }

        // Cria endereço Residencial e Comercial e Mostra o selecionado
        System.out.println("\nEndereço selecionado:");
        p.getEndereco().put("residencial", "R. Residenciall; Número: 1; Complemento: Apartamento; Bairo: Centro; CEP: 8144290; Cidade: Curitiba");
        p.getEndereco().put("comercial", "R. Commercial; Número: 2; Complemento: Casa; Bairo: Ipanema; CEP: 78289931; Cidade: Pontal do Sul");
        System.out.printf("Endereço: %s \n", p.getEndereco().get("residencial"));
    }
}