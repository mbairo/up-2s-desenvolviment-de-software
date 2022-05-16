public class pessoa {



    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;    

    public pessoa(){

    }


    // dois

    public pessoa (String nome, int idade, char genero, int gostaViajar, int gostaCinema, int gostaBalada, int gostaFicarEmCasa){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

    
    // fim dois



    public int getGostaBalada() {
        return gostaBalada;
    }
    public int getGostaCozinhar() {
        return gostaCozinhar;
    }

    public char getGenero() {
        return genero;
    }

    public int getGostaViajar() {
        return gostaViajar;
    }

    public String getNome() {
        return nome;
    }

    public int getGostaCinema() {
        return gostaCinema;
    }

    public int getGostaFicarEmCasa() {
        return gostaFicarEmCasa;
    }

    public int getIdade() {
        return idade;
    }

    public void setgostaBalada(int gostaBalada) {
        this.gostaBalada = gostaBalada;
    }

    public void setgostaCozinhar(int gostaCozinhar) {
        this.gostaCozinhar = gostaCozinhar;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setgostaViajar(int gostaViajar) {
        this.gostaViajar = gostaViajar;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setgostaCinema(int gostaCinema) {
        this.gostaCinema = gostaCinema;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public void setgostaFicarEmCasa(int gostaFicarEmCasa) {
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }

/// fim do ex um 


        // tres
        @Override
        public String toString() {
            return super.toString()
            + String.format("\nNome: %s \nIdade: %d \nGênero: %c \n Gosta de Viajar: %d \nGosta de cozinhar: %d \n Gosta de cinema: %d \n Gosta de balada %d \nGosta de ficar em casa: %d", this.nome, this.idade, this.genero, this.gostaViajar, this.gostaCozinhar, this.gostaCinema, this.gostaBalada, this.gostaFicarEmCasa);
        
        }
        // fim do tres 

        
        // quatro

        public double calcularCompatibilidade(pessoa p){
            return Math.sqrt(Math.pow(this.gostaViajar - p.gostaViajar, 2) + Math.pow(this.gostaCozinhar - p.gostaCozinhar, 2) + Math.pow(this.gostaBalada - p.gostaBalada, 2) + Math.pow(this.gostaFicarEmCasa - p.gostaFicarEmCasa, 2) + Math.pow(this.gostaCinema - p.gostaCinema, 2));
        }

    // CINCO ARRAY



 }


