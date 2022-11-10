package ListaLigadaAula;

public class Sistema {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.InsereNaFrente("A");
        System.out.println("Primeiro: " + lista.primeiro.getElemento());
        System.out.println("Último: " + lista.ultimo.getElemento());
        lista.InsereNaFrente("B");
        System.out.println("Primeiro: " + lista.primeiro.getElemento());
        System.out.println("Último: " + lista.ultimo.getElemento());
        lista.InsereNoFundo("C");
        System.out.println("Primeiro: " + lista.primeiro.getElemento());
        System.out.println("Último: " + lista.ultimo.getElemento());
    }
}
