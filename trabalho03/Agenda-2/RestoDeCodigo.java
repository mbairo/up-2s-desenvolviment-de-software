public class RestoDeCodigo {


    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;  
import java.util.Map;

public class Contato implements Comparable<Contato>{
    private String nome;
    private int rg;
    private String dataNascimento;
    private Map<String, String> email;
    private Map<String, String> telefones;
    private Map<String, String> endereco;

    public Contato(){
    }

    //construtora
    public Contato(String nome, int rg, String dataNascimento) {
        // inicializando as propriedades da instancia da classe
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.email = new HashMap<String, String>();
        this.telefones = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();
    }

    public String getNome()
    {
        return nome;
    }

    // sobre escrita da classe
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date dataNascimentoDate = sdf.parse(dataNascimento);
            sdf.format(dataNascimentoDate);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return String.format("Nome: %s; RG: %d; Data de Nascimento: %s", nome, rg, dataNascimento);
    }

    @Override
    public int compareTo(Contato o) {
        return this.nome.compareTo(o.nome);
    }

    public Map<String, String> getEmail() {
        return email;
    }
    public Map<String, String> getTelefones() {
        return telefones;
    }
    public Map<String, String> getEndereco() {
        return endereco;
    }
}














System.out.println("E-mail (Principal): \n");
String emailPrincipal = scanner.next();
System.out.println("E-mail (Secundário): \n");
String emailSecundario = scanner.next(); 

System.out.println("Telefone (Residencial):  \n");
String telefoneResidencial = scanner.next();
System.out.println("Telefone (Comercial):  \n");
String telefoneComercial = scanner.next();
System.out.println("Telefone (Celular):  \n");
String telefoneCelular = scanner.next();

System.out.println("Endereço (Residencial):  \n");
String enderecoResidencial = scanner.next();
System.out.println("Endereço (Comercial):  \n");
String enderecoComercial = scanner.next();





@Override
public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    try {
        Date dataNascimentoDate = sdf.parse(dataNascimento);
        sdf.format(dataNascimentoDate);
    } catch (ParseException e){
        e.printStackTrace();
    }
    return String.format("Nome: %s; RG: %d; Data de Nascimento: %s", nome, rg, dataNascimento);
}

    
}
