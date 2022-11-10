package conta;

public class ContaCorrente {

    static double dinheiroTotal;
    private double saldo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente(String nome, double saldo) {
        this.saldo = saldo;
        this.nome = nome;
    }

    double verificaSaldo() {
        return saldo;
    }

    double depositaValor(double valor) {
        saldo += valor;
        dinheiroTotal += valor;
        return valor;
    }

    double retiraValor(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Você sacou R$ " + valor);
        } else {
            System.out.println("Operação não realizada!");
        }
        dinheiroTotal -= valor;
        return valor;
    }
}
