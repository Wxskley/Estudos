package atividade;

public class Informacoes {

    private String cpf;
    private String nome;
    private String telefone;

    public Informacoes(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String dadosConcatenados() {
        return "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "Telefone: " + this.telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
