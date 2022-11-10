package festa;

public class Normal extends Ingresso {

    private String tipo = "Ingresso normal";

    public Normal(double valor) {
        super(valor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
