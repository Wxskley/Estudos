package pacote;

import java.util.Scanner;

public class ComandoFor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira um número");
        int n = leia.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

}
