package ListaLigadaAula;

public class Lista {
    
    public No primeiro;
    public No ultimo;
    private String nomeDaLista;
    
    public Lista(String nome) {
        this.nomeDaLista = nome;
        primeiro = ultimo = null;
    }
    
    public Lista() {
        this.nomeDaLista = "Lista dinâmica";
        primeiro = ultimo = null;
    }
    
    public boolean Vazia() {
        return primeiro == null;
    }
    
    public void InsereNaFrente(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            primeiro = new No(item, primeiro);
        }
    }
    
    public void InsereNoFundo(String item) {
        if (Vazia()) {
            primeiro = ultimo = new No(item);
        } else {
            ultimo.setProx(new No(item));
            ultimo = ultimo.getProx();
        }
    }
    
    public String RemoveDaFrente() {
        if (Vazia()) {
            return null;
        }
        String item = primeiro.getElemento();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            primeiro = primeiro.getProx();
        }
        return item;
    }

    public String RemoveDoFundo() {
        if (Vazia()) {
            return null;
        }
        String item = primeiro.getElemento();
        if (primeiro == ultimo) {
            primeiro = ultimo = null;
        } else {
            No atual = primeiro;
            while (atual.getProx() != ultimo) {
                atual = atual.getProx();
            }
            ultimo = atual;
            atual.setProx(null);
        }
        return item;
    }
}
