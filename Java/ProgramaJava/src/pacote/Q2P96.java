package pacote;

public class Q2P96 {

    public static void main(String[] args) {
        int n = 0;
        int soma = 0;
        for (int i = 0; i <= 500; i++) {
            if ((n % 2 != 0) && (n % 3 == 0)) {
                soma = soma + n;
            }
            System.out.println(n);
        }
    }
}
