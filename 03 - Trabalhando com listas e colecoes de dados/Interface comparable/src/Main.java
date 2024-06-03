import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("Harry Potter e a Câmara Secreta (2002)", 2002);
        Titulo titulo2 = new Titulo("Harry Potter e o Prisioneiro de Azkaban (2004)", 2004);
        Titulo titulo3 = new Titulo("Harry Potter e o Enigma do Príncipe (2009)", 2009);
        Titulo titulo4 = new Titulo("Harry Potter e o Cálice de Fogo (2005)", 2005);
        Titulo titulo5 = new Titulo("Harry Potter e as Relíquias da Morte – Parte 1 (2010)", 2010);
        Titulo titulo6 = new Titulo("Harry Potter e a Ordem da Fênix (2007) ", 2007);
        Titulo titulo7 = new Titulo("Harry Potter e as Relíquias da Morte – Parte 2 (2011)", 2011);
        Titulo titulo8 = new Titulo("Harry Potter e a Pedra Filosofal (2001)", 2001);

        // contar o total de objetos

        System.out.println(Titulo.getContadorDeObjetos());

        // Criando minha lista

        List<Titulo> meusTitulos = new ArrayList<>();
        // Agora criando um for para adicionar todos os titulos dentro da lista
        meusTitulos.add(titulo1);
        meusTitulos.add(titulo2);
        meusTitulos.add(titulo3);
        meusTitulos.add(titulo4);
        meusTitulos.add(titulo5);
        meusTitulos.add(titulo6);
        meusTitulos.add(titulo7);
        meusTitulos.add(titulo8);

        // Imprimir a lista sem ordem

        System.out.println("\nLISTA DE FILMES SEM ORDEM\n");
        System.out.println(meusTitulos);

        // Ordenando a lista de filmes por lancamento.

        System.out.println("\nLISTA DE FILMES EM ORDEM\n");
        meusTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(meusTitulos);





    }
}