package pacote;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = read.next();
        System.out.println("Digite sua idade");
        int idade = read.nextInt();
        int idade2025 = idade + 4;
        if (idade > 0) {
            System.out.println("Essa é sua idade em 2025: " + idade2025);
        }

    }
}
