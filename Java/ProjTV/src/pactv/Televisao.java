package pactv;

public class Televisao {

    private String marca;
    private String modelo;
    private String dataLancamento;
    private double precoCusto;
    private int polegadas;
    private String tela;
    private double precoDeVenda;
    private double precoComDesconto;

    public Televisao(String marca, String modelo, String dataLancamento, double precoCusto, int polegadas, String tela) {
        this.marca = marca;
        this.modelo = modelo;
        this.dataLancamento = dataLancamento;
        this.precoCusto = precoCusto;
        this.polegadas = polegadas;
        this.tela = tela;
    }

    public double getPrecoDeVenda() {
        return (precoCusto / 100) * 135;
    }

    public double getPrecoComDesconto() {
        return ((precoCusto / 100) * 135) * 0.95;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
}
