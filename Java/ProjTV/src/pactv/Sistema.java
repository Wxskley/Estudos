package pactv;

public class Sistema {

    public static void main(String[] args) {
        Televisao a = new Televisao("Samsung","8K","22/03/2020",1000,52,"QLED");
        System.out.println(a.getPrecoCusto());
        System.out.println(a.getPrecoDeVenda());
        System.out.println(a.getPrecoComDesconto());
    }

}
