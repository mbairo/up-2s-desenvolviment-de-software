import javax.swing.plaf.synth.SynthSeparatorUI;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        int [] pessoas = new int[6];

        pessoas[0] = new pessoas("Felipe", "M", 90, 100, 80, 30, 70 );
        pessoas[1] = new pessoas("Maria", "F", 50, 70, 100, 50, 90 );
        pessoas[2] = new pessoas("Cristina", "F", 50, 20, 30, 70, 30 );
        pessoas[3] = new pessoas("Leonardo", "M", 80, 10, 60, 80, 50 );
        pessoas[4] = new pessoas("João", 27, 'M', 100, 30, 50,100, 10)
        pessoas[5] = new pessoas("Jéssica", 45, 'F', 85, 60, 70, 50, 60);


        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme a idade");
        int idade = scanner.nextInt();

        if (idade  >= 18) {
            System.out.println("\nInforme a genero: ");
            int genero = scanner.nextInt();

            System.out.println("\nInforme o quanto você gosta de viajar: ");
            int viajar = scanner.nextInt();

            System.out.println("\nInforme o quanto você gosta de cozinhar: ");
            int cozinhar = scanner.nextInt();

            System.out.println("\nInforme o quanto você gosta de cinema: ");
            int cinema = scanner.nextInt();

            System.out.println("\nInforme o quanto você gosta de balada: ");
            int balada = scanner.nextInt();

            System.out.println("\nInforme o quanto você gosta de casa: ");
            int casa = scanner.nextInt();
        }


    
        pessoas NovaPessoa = new.pessoas(genero, viajar, cozinhar, cinema, balada, casa)


        int [] NovaPessoa = new int[5];

        NovaPessoa[0] = new NovaPessoa("M", 90, 100, 80, 30, 70 );
        NovaPessoa[1] = new NovaPessoa("F", 50, 70, 100, 50, 90 );
        NovaPessoa[2] = new NovaPessoa("F", 50, 20, 30, 70, 30 );
        NovaPessoa[3] = new NovaPessoa("M", 80, 10, 60, 80, 50 );
        NovaPessoa[4] = new NovaPessoa('M', 100, 30, 50,100, 10)
        NovaPessoa[5] = new NovaPessoa('F', 85, 60, 70, 50, 60);


        for (int i = 1; i < pessoas.length; i++) {
          
            if (genero == pessoa [i]) {
                System.out.println("\n Genero incompativel ");
            }



        }

        







    }





}
