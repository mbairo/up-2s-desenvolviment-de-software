package logica;
 
public class Calculadora{
    private double x;
    private double y;
    
    //construtora
    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //parte que realiza a operação.
    public double somar() {
        return x + y;
    }

    public double subtrair() {
        return x - y;
    }

    public double multiplicar() {
        return x * y;
    }
    public double dividir() {
        return x / y;
    }
}