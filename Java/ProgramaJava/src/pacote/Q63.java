package pacote;

import java.util.Scanner;

public class Q63 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double pao = 0.12;
        double broa = 1.50;
        System.out.println("Quantos pães foram vendidos?");
        double quantPao = read.nextDouble();
        System.out.println("Quantas broas foram vendidas?");
        double quantBroa = read.nextDouble();
        double resultado = (quantPao * pao) + (quantBroa * broa);
        double resultado1 = (resultado * 0.15);
        double resultado2 = (resultado * 0.10);
        if (resultado > 500) {
            System.out.println("Você arrecadou um total de " + resultado + " e deve guardar " + resultado1 + " na poupança");
        } else {
            System.out.println("Você arrecadou um total de " + resultado + " e deve guardar " + resultado2 + " na poupança");
        }
    }

}
