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
    

    //construtora
    public Contato (String nome, int rg, String dataNascimento) {
        // inicializando as propriedades da instancia da classe
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.email = new HashMap<String, String>();
        this.telefones = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();
        
    }

    // sobre escrita da classe

    @Override
    public String toString() {
        return String.format("Nome: %s; RG: %d; Data de Nascimento: %s", nome, rg, dataNascimento, email);
    }

    @Override
    public int compareTo(Contato o) {
        // comparação com base na idade
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