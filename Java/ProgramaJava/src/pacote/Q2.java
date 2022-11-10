package pacote;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu peso");
        double peso = read.nextDouble();
        double pesoMes8 = 9.6;
        double pesoOriginal = peso - pesoMes8;
        System.out.println("Nesse ano você já engordou: " + pesoMes8 + " quilos.");
        System.out.println("Seu peso no começo do ano era: " + pesoOriginal);
    }
}
