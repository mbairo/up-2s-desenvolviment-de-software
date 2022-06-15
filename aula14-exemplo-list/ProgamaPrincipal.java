import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgamaPrincipal {
    public static void main(String[] args) {
        // instanciar um LIst de Pessoa  // tipagem<>
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        // adicionar objetos na lista
        pessoas.add(new Pessoa("João", 25, 78, 1.76));
        pessoas.add(new Pessoa("Pedro", 40, 120, 1.73));
        pessoas.add(new Pessoa("Francieli", 33, 65, 1.63));
        pessoas.add(new Pessoa("Diogo", 15, 54, 1.63));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.56));

        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // ordenação
        System.out.println("\n --------- Ordenação --------\n");
        Collections.sort(pessoas);

        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // criar nova pessoa

        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("residencial", "41 3264-3273");
        p.getTelefones().put("comercial", "41 3234-3276");
        p.getTelefones().put("celular", "41 99343-3273");

        System.out.printf("Telefone Ceular: %s \n", p.getTelefones().get("celular"));

    }
}
