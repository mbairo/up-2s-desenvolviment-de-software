//import java.util.HashMap;
//import java.util.Map;
 
public class Endereco {
    private String logradouro; 
    private int numero;
    private String complemento;
    private String bairro;
    private int cep;
    private String cidade;
   //private Map<String, String> endereco;

    //construtora
    public Endereco (String logradouro, int numero, String complemento, String bairro, int cep, String cidade) {
        // inicializando as propriedades da instancia da classe
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
       // this.endereco = new HashMap<String, String>();
    }

    // sobre escrita da classe
    @Override
    public String toString() {
        return String.format("Logradouro: %s; Número: %d; Complemento: %s; Bairo: %s; CEP: %d; Cidade: %s", logradouro, numero, complemento, bairro, cep, cidade);
    }

    //public Map<String, String> getEnderco() {
      //  return endereco;
    //}
}

