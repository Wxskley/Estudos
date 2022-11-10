package pacFisiologia;

public class Calculos {

    private double altura, peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC(double altura, double peso) {
        return peso / ((altura) * (altura));
    }
}
