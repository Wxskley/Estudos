package atividade;

public class Lista {

    private No inicio;
    private No fim;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public void InserirInicio(Informacoes valores) {
        No primeiroNo = new No(valores);
        if (VerificarVazio()) {
            inicio = fim = primeiroNo;
        }
        primeiroNo.setProximoNo(inicio);
        inicio = primeiroNo;
    }

    public void InserirFim(Informacoes valores) {
        No primeiroNo = new No(valores);
        if (VerificarVazio()) {
            inicio = fim = primeiroNo;
        }
        fim.setProximoNo(primeiroNo);
        fim = primeiroNo;
    }

    public Informacoes removerInicio() {
        Informacoes valores = inicio.getValores();
        inicio = inicio.getProximoNo();
        if (VerificarVazio()) {
            fim = null;
        }
        return valores;
    }

    public Informacoes removerFim() {
        No primeiroNo = inicio;
        No ultimoNo = fim;
        if (inicio == fim) {
            Informacoes valores = inicio.getValores();
            inicio = fim = null;
            return valores;
        }
        while (primeiroNo.getProximoNo() != ultimoNo) {
            primeiroNo = primeiroNo.getProximoNo();
        }
        primeiroNo.setProximoNo(null);
        fim = primeiroNo;
        return ultimoNo.getValores();
    }

    public boolean VerificarVazio() {
        return inicio == null;
    }

}
