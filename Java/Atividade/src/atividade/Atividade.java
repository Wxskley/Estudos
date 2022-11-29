package atividade;

public class Atividade {

    public static void main(String[] args) {
        Lista lista = new Lista();
        //Inserindo os dados na lista || Dados compostos por Nome, CPF e Telefone.
        //Inserindo pelo Início e listando
        lista.InserirInicio(new Informacoes("Weskley", "999.999.999-10", "88 98888-8888"));
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        lista.InserirInicio(new Informacoes("Fulano", "999.999.999-11", "88 98888-9999"));
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        lista.InserirInicio(new Informacoes("Beltrano", "999.999.999-12", "88 98888-1010"));
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        //Inserindo pelo Fim e listando
        lista.InserirFim(new Informacoes("Sicrano", "999.999.999-13", "88 98888-0000"));
        System.out.println(lista.getFim().getValores().dadosConcatenados());
        lista.InserirFim(new Informacoes("Maria", "999.999.999-14", "88 98888-8585"));
        System.out.println(lista.getFim().getValores().dadosConcatenados());
        lista.InserirFim(new Informacoes("Zé", "999.999.999-15", "88 98888-7474"));
        System.out.println(lista.getFim().getValores().dadosConcatenados());
        //Removendo os dados do início da lista
        System.out.println("\n");
        System.out.println("Teste de Remoção Do início");
        System.out.println("Primeiro da Lista");
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        lista.removerInicio();
        System.out.println("Excluído");
        System.out.println("\nNovo primeiro da lista");
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        lista.removerInicio();
        System.out.println("Excluído");
        System.out.println("\nNovo primeiro da lista");
        System.out.println(lista.getInicio().getValores().dadosConcatenados());
        //Removendo dados do final da lista
        System.out.println("\n");
        System.out.println("Teste de Remoção Do Fim");
        System.out.println("Último da Lista");
        System.out.println(lista.getFim().getValores().dadosConcatenados());
        lista.removerFim();
        System.out.println("Excluído");
        System.out.println("\nNovo último da Lista");
        System.out.println(lista.getFim().getValores().dadosConcatenados());
        lista.removerFim();
        System.out.println("Excluído");
        System.out.println("\nNovo último da Lista");
        System.out.println(lista.getFim().getValores().dadosConcatenados());
    }

}
