package festa;

public class CamaroteSuperior extends VIP {

    private double adicionalCamaroteSup;

    public CamaroteSuperior(double valor, double adicionalCamaroteSup) {
        super(valor);
        this.adicionalCamaroteSup = adicionalCamaroteSup;
    }

    public double getAdicional() {
        return ((valor / 100) * 110);
    }

    public double getAdicionalCama() {
        return ((adicionalCamaroteSup / 100) * 110);
    }

    public void setAdicional(double adicional) {
        this.adicionalCamaroteSup = adicionalCamaroteSup;
    }

}
