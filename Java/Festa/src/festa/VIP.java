package festa;

public class VIP extends Ingresso {

    private double adicional;

    public VIP(double valor) {
        super(valor);
    }

    public double getAdicional() {
        return ((this.valor / 100) * 110);
    }
}
