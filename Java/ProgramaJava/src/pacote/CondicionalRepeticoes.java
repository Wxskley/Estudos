package pacote;

import java.util.Scanner;

public class CondicionalRepeticoes {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Informe a sua idade");
            int idade = read.nextInt();
            if (idade >= 18) {
                System.out.println("Você atingiu a maior idade");
            } else {
                System.out.println("Você ainda não atingiu a maior idade");
            }
        }
    }

}
