public class ProgramaPrincial {
    
    public static void main(String[] args) {
        Ponto pt1 = new Ponto(); // Poderia ter sido feito assim >>> new Ponto (0,0)
        Ponto pt2 = new Ponto(5, 10);
        Ponto pt3 = new Ponto(7, 10);

        System.out.println(pt1.toString()); // por baixo dos panos é toString // um objeto sendo lido como string
        System.out.println(pt2);
        System.out.println(pt3);

        System.out.printf("Distância pt1 -> origem = %f \n", pt1.distancia());
        System.out.printf("Distância pt1 -> pt2 = %f \n", pt1.distancia(pt2));
        System.out.printf("Distância pt2 -> pt3 = %f \n", pt2.distancia(pt3));

    }
}
 