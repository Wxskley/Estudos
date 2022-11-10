package pacote;

import java.util.Scanner;

public class ComandoWhile {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número ou 0 para sair");
        int n = leia.nextInt();
        while (n != 0) {
            System.out.println("Número digitado " + n);
            System.out.println("Infome um número ou 0 para sair");
            n = leia.nextInt();
        }
    }

}
