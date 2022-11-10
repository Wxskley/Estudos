package festa;

public class CamaroteInferior extends VIP {

    private String locaIngresso;

    public CamaroteInferior(String locaIngresso) {
        super(0);
        this.locaIngresso = locaIngresso;
    }

    public String getLocaIngresso() {
        return locaIngresso;
    }

    public void setLocaIngresso(String locaIngresso) {
        this.locaIngresso = locaIngresso;
    }

}
