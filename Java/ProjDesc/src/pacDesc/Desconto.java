package pacDesc;

public class Desconto {

    private double precoDesc;

    public double getPrecoDesc() {
        return precoDesc;
    }

    public void setPrecoDesc(double precoDesc) {
        this.precoDesc = precoDesc;
    }

    public double getPrecoSemDesc(double precoDesc) {
        return precoDesc;
    }

    public double getDesc10PorCent(double precoDesc) {
        return precoDesc * 0.90;
    }

    public double getDesc20PorCent(double precoDesc) {
        return precoDesc * 0.80;
    }
}
