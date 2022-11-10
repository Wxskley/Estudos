package controller;

public class CalcularPao {

    private int ctQuantidade;

    public int getCtQuantidade() {
        return ctQuantidade;
    }

    public void setCtQuantidade(int ctQuantidade) {
        this.ctQuantidade = ctQuantidade;
    }

    public double getQuantidadeFarinhaTrigo(double ctQuantidade) {
        return ctQuantidade * 1;
    }

    public double getQuantidadeSal(double ctQuantidade) {
        return ctQuantidade * 1.5;
    }

    public double getQuantidadeAcucar(double ctQuantidade) {
        return ctQuantidade * 1;
    }

    public double getQuantidadeFermento(double ctQuantidade) {
        return ctQuantidade * 4;
    }

    public double getQuantidadeOvo(double ctQuantidade) {
        return ctQuantidade * 1;
    }

    public double getQuantidadeMargarina(double ctQuantidade) {
        return ctQuantidade * 100;
    }

    public double getQuantidadeAgua(double ctQuantidade) {
        return ctQuantidade * 600;
    }
}
