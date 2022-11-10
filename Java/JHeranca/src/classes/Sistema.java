package classes;

import java.util.Date;

public class Sistema {

    public static void main(String[] args) {
//        Aluno aluno = new Aluno("João do fusca", "123", new Date());
//        Professor professor = new Professor("Barreto", "222", new Date());
//        aluno.setMatricula(1010);
//        System.out.println("Dados do aluno");
//        System.out.println("Nome: " + aluno.getNome());
//        System.out.println("CPF: " + aluno.getCpf());
//        System.out.println("Nascimento: " + aluno.getDataNascimento());
//        System.out.println("Matrícula:" + aluno.getMatricula());
//        System.out.println("Dados do professor: ");
//        System.out.println("Nome: " + professor.getNome());
//        System.out.println("CPF: " + professor.getCpf());
//        System.out.println("Nascimento: " + professor.getDataNascimento());
//        professor.setSalario(3000);
//        System.out.println("Salário R$: " + professor.getSalario());
        Aluno aluno = new Aluno("Zé da roda", "123", new Date());
        Professor professor = new Professor("Zé da Mão", "456", new Date());
        System.out.println("Valor a pagar por Aluno R$: " + aluno.valorCopia(20));
        System.out.println("Valor a pagar por Professor R$: " + professor.valorCopia(20));
    }

}
