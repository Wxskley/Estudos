package pacote;

import java.util.Scanner;

public class Q72 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = read.nextInt();
        if (idade <= 10) {
            System.out.println("Criança");
        } else if (idade > 10 && idade <= 14) {
            System.out.println("Adolescente");
        } else if (idade > 14 && idade <= 35) {
            System.out.println("Jovem");
        } else {
            System.out.println("Adulto");
        }
    }

}
