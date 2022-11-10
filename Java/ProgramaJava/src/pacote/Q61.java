package pacote;

import java.util.Scanner;

public class Q61 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira sua primeira nota");
        double n1 = read.nextDouble();
        System.out.println("Insira sua segunda nota");
        double n2 = read.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println(media);
        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 4) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
