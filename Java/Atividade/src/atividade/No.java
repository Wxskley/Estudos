package atividade;

public class No {

    private Informacoes valores;
    private No proximoNo;

    public Informacoes getValores() {
        return valores;
    }

    public void setValores(Informacoes valores) {
        this.valores = valores;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public No(Informacoes valores) {
        this.valores = valores;
    }

    public No(Informacoes valores, No proximoNo) {
        this.valores = valores;
        this.proximoNo = proximoNo;
    }
}
