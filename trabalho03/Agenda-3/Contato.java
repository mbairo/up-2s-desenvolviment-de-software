public class Contato implements Comparable<Contato>{
    private String nome;
    private int rg;
    private String dataNascimento;
    private String emailPrincipal;
    private String emailSecundario;
    private int telefoneResidencial;
    private int telefoneComercial;
    private int telefoneCelular;
    private String enderecoResidencial;
    private String enderecoComercial;

    //construtora   (String,      int,    String,            String,                   String,               String, String, String, String, String)
    public Contato (String nome, int rg, String dataNascimento, String emailPrincipal, String emailSecundario, int telefoneResidencial, int telefoneComercial, int telefoneCelular, String enderecoResidencial, String enderecoComercial) {
        // inicializando as propriedades da instancia da classe
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.emailPrincipal = emailPrincipal;
        this.emailSecundario = emailSecundario;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;   
        this.telefoneCelular = telefoneCelular;
        this.enderecoResidencial = enderecoResidencial;
        this.enderecoComercial = enderecoComercial; 
    }
    // sobre escrita da classe
    @Override
    public String toString() {
        return String.format("Nome: %s; RG: %d; Data de Nascimento: %s; Email Principal: %s; Email Secundário: %s; Telefone Residencial %d; Telefone Comercial %d; Telefone Celular %d; Endereço Residencial: %s; Endereço Comercial %s", nome, rg, dataNascimento, emailPrincipal, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial);
    }

    @Override
    public int compareTo(Contato o) {
        // comparação com base na idade
        return this.nome.compareTo(o.nome);
    }
    public Object getNome() {
        return null;
    }
    public void setNome(String novoNome) {
    }
}