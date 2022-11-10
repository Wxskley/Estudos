package empresa;

public class Veiculos {

    private String modelo;
    private String fabricante;
    private String combustivel;
    private int ano;
    private double imposto;
    private double valor;

    Veiculos(String uno_com_escada, String fiat, String gasolina, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public void Veiculos(String modelo, String fabricante, String combustivel, int ano, double valor) {;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.ano = ano;
        this.valor = valor;
    }

    public void valor(double valor, double imposto) {
        this.valor = valor;
        this.imposto = (valor / 100) * 17;
    }

    public double getCustoFinal() {
        return valor + imposto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
