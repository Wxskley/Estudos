package pacote;

import java.util.Scanner;

public class Q73 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = read.next();
        System.out.println("Digite seu salário");
        double salario = read.nextDouble();
        System.out.println("Você tem quantos filhos?");
        int filhos = read.nextInt();
        double ate2Filhos = 20, de2Ate4Filhos = 15, de4Ate6Filhos = 10, de6Ate8Filhos = 5, maisQue8Filhos = -10;
        if (salario > 975) {
            System.out.println("Você não tem direito ao salário família!");
        } else if (salario <= 975 && filhos <= 2) {
            System.out.println("seu salário família é " + (salario + (filhos * ate2Filhos)) + ", você teve bônus de " + (20 * filhos) + " reais.");
        } else if (salario <= 975 && filhos > 2 && filhos <= 4) {
            System.out.println("seu salário família é " + (salario + (filhos * de2Ate4Filhos)) + ", você teve bônus de " + (15 * filhos) + " reais.");
        } else if (salario <= 975 && filhos > 4 && filhos <= 6) {
            System.out.println("seu salário família é " + (salario + (filhos * de4Ate6Filhos)) + ", você teve bônus de " + (10 * filhos) + " reais.");
        } else if (salario <= 975 && filhos > 6 && filhos <= 8) {
            System.out.println("seu salário família é " + (salario + (filhos * de6Ate8Filhos)) + ", você teve bônus de " + (5 * filhos) + " reais.");
        } else if (salario <= 975 && filhos > 8) {
            System.out.println("seu salário família é " + (salario - (((10 * filhos)) - (10 * 8))) + ", você teve multa de " + (((10 * filhos)) - (10 * 8)) + " reais.");
        }
    }
}
