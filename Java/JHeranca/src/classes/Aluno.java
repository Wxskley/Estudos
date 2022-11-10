package classes;

import java.util.Date;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public double valorCopia(double qtd) {
        return 0.05 * qtd;
    }
}
