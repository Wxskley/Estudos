package pacote;

import java.util.Scanner;

public class Q3P96 {

    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        System.out.println("Digite um valor");
//        int valor = read.nextInt();
//        while (valor != 0) {
//            System.out.println("Digite um valor");
//            System.out.println("Tecle 0 para continuar");
//            valor = read.nextInt();
//        }
//        while (valor == 0) {            
//            
//        }
        Scanner read = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        int num = 0;
        double media;
        int contador_negativos = 0;
        int contador_positivos = 0;
        double percent_negativos;
        double percent_positivos;

        System.out.println("quantidade de valores");
        int cont = read.nextInt();
        while (i <= cont) {
            System.out.println("Insira um valor");
            cont = read.nextInt();
            soma = soma + num;
            if (num > 0) {
                contador_positivos = contador_positivos;
            } else if (num < 0) {
                contador_negativos = contador_negativos;
            }
            media = (soma / cont);
            percent_negativos = (contador_negativos / soma) * 100;
            percent_positivos = (contador_positivos / soma) * 100;
            System.out.println("Média aritmética" + media);
            System.out.println("Quantidade de numeros positivos: " + contador_positivos);
            System.out.println("Quantidade de numeros negativos: " + contador_negativos);
            System.out.println("Percentual de numeros positivos: " + percent_positivos);
            System.out.println("Percentual de numeros negativos: " + percent_negativos);
        }

    }

}
