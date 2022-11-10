package conta;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = 0;
        System.out.println("Informe o usuário da conta");
        String nome = read.next();
        ContaCorrente conta = new ContaCorrente(nome = read.next(), 0);
        System.out.println("1 - Saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque");
        System.out.println("4 - Titular");
        System.out.println("5 - Mudar titular");
        System.out.println("0 - Sair");
        number = read.nextInt();
        while (number != 0) {
            switch (number) {
                case 1:
                    System.out.println("Saldo R$" + conta.verificaSaldo());
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    double valorDeposito;
                    System.out.println("Você depositou R$" + conta.depositaValor(valorDeposito = read.nextDouble()));
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    double valorSaque;
                    conta.retiraValor(valorSaque = read.nextDouble());
                    break;
                case 4:
                    System.out.println("Titular: " + conta.getNome());
                    break;
                case 5:
                    System.out.println("Informe o nome do novo titular ");
                    nome = read.next();
                    conta.setNome(nome);
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("4 - Titular");
            System.out.println("5 - Mudar titular");
            System.out.println("0 - Sair");
            System.out.println("Informe um valor para continuar ou sair do sistema");
            number = read.nextInt();
        }
        System.out.println("Sistema encerrado");
    }

}
