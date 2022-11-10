package pacote;

import java.util.Scanner;

public class Q71 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Nome do funcionário");
        String nomeFunc = read.next();
        System.out.println("Setor de trabalho");
        int setorFunc = read.nextInt();
        System.out.println("Salário do funcionário");
        double salarioFunc = read.nextDouble();
        double gratif1 = 200, gratif2 = 300, gratif3 = 400;
        double salaGraft1 = salarioFunc + gratif1, salaGraft2 = salarioFunc + gratif2, salaGraft3 = salarioFunc + gratif3;
        if (setorFunc == 1) {
            System.out.println("O funcionário " + nomeFunc + " trabalha no setor 1 e ganha " + salaGraft1 + " e a gratificação é: " + gratif1);
        } else if (setorFunc == 2) {
            System.out.println("O funcionário " + nomeFunc + " trabalha no setor 1 e ganha " + salaGraft2 + " e a gratificação é: " + gratif2);
        } else if (setorFunc == 3) {
            System.out.println("O funcionário " + nomeFunc + " trabalha no setor 1 e ganha " + salaGraft3 + " e a gratificação é: " + gratif3);
        } else {
            System.out.println("Setor inválido - erro de sistema");
        }
        {
        }
    }

}
