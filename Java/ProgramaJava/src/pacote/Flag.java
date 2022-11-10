package pacote;

import java.util.Scanner;

public class Flag {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um valor qualquer ou 0 para sair");
        int w = read.nextInt();
        while (w != 0) {
            System.out.println("Valor informado " + w);
            System.out.println("Informe um valor qualquer ou 0 para sair");
            w = read.nextInt();
        }
    }

}
