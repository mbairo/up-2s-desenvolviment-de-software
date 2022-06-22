import java.util.ArrayList;
class Contatos {
	ArrayList<String> listaDeContatos = new ArrayList<String>();
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
	
	public Contatos(String nome, int rg, String dataNascimento, String emailPrincipal,
			String emailSecundario, int telefoneResidencial, int telefoneComercial, int telefoneCelular,
			String enderecoResidencial, String enderecoComercial) {
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

	// Getters
	public String getNome() {
		return nome;
	}

	public int getRg() {
		return rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getEmailPrincipal() {
		return emailPrincipal;
	}

	public String getEmailSecundario() {
		return emailSecundario;
	}

	public int getTelefoneResidencial() {
		return telefoneResidencial;
	}
	
	public int getTelefoneComercial() {
		return telefoneComercial;
	}

	public int getTelefoneCelular() {
		return telefoneCelular;
	}
	
	public String getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public String getEnderecoComercial() {
		return enderecoComercial;
	}

	public static Contatos salvaNaAgenda(String nome, int rg, String dataNascimento, String emailPrincipal,
	String emailSecundario, int telefoneResidencial, int telefoneComercial, int telefoneCelular,
	String enderecoResidencial, String enderecoComercial) {
		return new Contatos( nome, rg, dataNascimento, emailPrincipal, emailSecundario, telefoneResidencial, telefoneComercial, telefoneCelular, enderecoResidencial, enderecoComercial);
	}
	
	private ArrayList<Contatos> contatosSalvos;
	public Contatos() {
		this.contatosSalvos = new ArrayList<Contatos>();
	}
	
	public boolean salvaContato(Contatos contato) {
		contatosSalvos.add(contato);
		return true;
	}
	
	public boolean atualiza(Contatos contatoExistente, Contatos contatoEditado) {
		int indiceDaLista = buscaContato(contatoExistente);
		// add novo contato no indice
		this.contatosSalvos.set(indiceDaLista, contatoEditado);
		return true;
	}
	
	public boolean removeContato(Contatos contato) {
		int indiceDaLista = buscaContato(contato);
		this.contatosSalvos.remove(indiceDaLista);
		return true;
	}
	
	// Busca o indice da lista onde está salvo o contato.
	private int buscaContato(Contatos contato) {
		return this.contatosSalvos.indexOf(contato);
	}
	
	private int buscaContato(String nomeBuscado) {
		 for(int indice =0; indice < contatosSalvos.size(); indice++) {
			 Contatos Contatos = this.contatosSalvos.get(indice);
			 if(Contatos.getNome().equals(nomeBuscado)) {
				 return indice;
			 }
		 }
		 return -1;
	}
	
	public Contatos localizaNaAgenda(String name) {
		int indiceLista = buscaContato(name);
		if(indiceLista >=0) {
			return this.contatosSalvos.get(indiceLista);
		}
		return null;
	}

	public void mostraLista() {
		for(int indice = 0; indice < this.contatosSalvos.size(); indice++) {
			System.out.println(
				   					  "\nNome:" + this.contatosSalvos.get(indice).getNome() 
									+ "\nRg " + this.contatosSalvos.get((indice)).getRg()
									+ "\nData de Aniversário: " + this.contatosSalvos.get((indice)).getDataNascimento()
									+ "\nE-mail Principal" + this.contatosSalvos.get((indice)).getEmailPrincipal()
									+ "\nE-mail Secundário: " + this.contatosSalvos.get((indice)).getEmailSecundario() 
									+ "\nTelefone Residencial" + this.contatosSalvos.get((indice)).getTelefoneResidencial()
									+ "\nTelefone Comercial" + this.contatosSalvos.get((indice)).getTelefoneComercial() 
									+ "\nTelefone Celular" + this.contatosSalvos.get((indice)).getTelefoneCelular()
									+ "\nEndereço Residencial" + this.contatosSalvos.get((indice)).getEnderecoResidencial()
									+ "\nEndereço Comercial" + this.contatosSalvos.get((indice)).getEnderecoComercial()
									+ "\n*******************");
		}
	}
}
