package classes;

import java.util.Date;

public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, String cpf, Date dataNascimento) {
        super(nome, cpf, dataNascimento);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
