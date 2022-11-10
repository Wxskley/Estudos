package pacote;

import java.util.Scanner;

public class Q67 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float altura, pesoMulher, pesoHomem;
        String nome, sexo;
        System.out.println("Digite seu nome");
        nome = read.next();
        System.out.println("Seu sexo (M ou F)");
        sexo = read.next();
        System.out.println("Qual a sua altura?");
        altura = read.nextFloat();
        pesoHomem = (float) ((72.7 * altura) - 58);
        pesoMulher = (float) ((62.1 * altura) - 44.7);
        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("O seu peso ideal " + nome + " é " + pesoHomem);
        } else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("O seu peso ideal " + nome + " é " + pesoMulher);
        }
    }
}
