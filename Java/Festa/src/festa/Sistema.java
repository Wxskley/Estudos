package festa;

public class Sistema {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);
        VIP vip = new VIP(50);
        Normal normal = new Normal(40);
        CamaroteInferior camaInferior = new CamaroteInferior("Camarote inferior, 4° porta a esquerda!");
        CamaroteSuperior camaSuperior = new CamaroteSuperior(50, 40);

        System.out.println(ingresso.imprimeValor());
        System.out.println(vip.getAdicional());
        System.out.println(normal.getTipo());
        System.out.println(camaInferior.getLocaIngresso());
        System.out.println(camaSuperior.getAdicional());
        System.out.println(camaSuperior.getAdicionalCama());

    }

}
