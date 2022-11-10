package pacote;

import java.util.Scanner;

public class Q62 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = read.next();
        System.out.println("Insira o seu salário");
        double salario = read.nextDouble();
        double aumento1 = salario + 200;
        double aumento2 = salario + 150;
        if (salario <= 975.50) {
            System.out.println("O seu salário base é " + salario + " ,seu salário agora é " + aumento1 + " e seu aumento foi de 200 reais");
        } else {
            System.out.println("O seu salário base é " + salario + " ,seu salário agora é " + aumento2 + " e seu aumento foi de 150 reais");
        }
    }

}
