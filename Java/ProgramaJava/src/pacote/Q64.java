package pacote;

import java.util.Scanner;

public class Q64 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Insira o nome do vendedor");
        String vendedor = read.next();
        System.out.println("Insira o valor da venda");
        double venda = read.nextDouble();
        double venda3 = venda * 0.035;
        double venda2 = venda * 0.025;
        if (venda > 1500) {
            System.out.println("O valor da venda foi " + venda + " e o vendedor ganhou " + venda3);
        } else {
            System.out.println("O valor da venda foi " + venda + " e o vendedor ganhou " + venda2);
        }
    }

}
