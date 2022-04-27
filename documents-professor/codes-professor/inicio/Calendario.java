import java.util.Scanner;

public class Calendario {
    // Atributos

    // Construtores de objetos

    // Funcoes e procedimentos
    public static String mostrarMesIf(int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "Janeiro";
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        } else if (mes == 3) {
            nomeMes = "Março";
        } // vai ate Dezembro
        return nomeMes;
    }

    public static String mostrarMesSwitch(int mes) {
        String nomeMes = "";
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            // vai ate dezembro
        }
        return nomeMes;
    }

    // Rotina principal

    public static void main(String[] args) {
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o mês:");
        mes = input.nextInt();
        System.out.println("Mês (if) = " + mostrarMesIf(mes));
        System.out.println("Mês (switch) = " + mostrarMesSwitch(mes));
    }
}