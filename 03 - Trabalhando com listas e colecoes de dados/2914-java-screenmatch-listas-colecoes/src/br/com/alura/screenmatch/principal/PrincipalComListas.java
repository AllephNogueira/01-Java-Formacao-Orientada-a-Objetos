package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Tropa de elite", 2002);
        filme1.avalia(10);
        Filme filme2 = new Filme("Tropa de elite 2", 2006);
        filme2.avalia(10);
        Serie serie1 = new Serie("The walking dead", 2008);
        serie1.avalia(7);
        Serie serie2 = new Serie("Lost", 2009);
        serie2.avalia(6);

        // Criando minha ArrayList
        ArrayList<Titulo> listaDeFilmes = new ArrayList<>(); // Observa que parametrizamos usando a classe mae
        // Antigamente usavamos Filme, mas ai precisariamos criar 2 ArrayList, usando a classe mae podemos usar as 2 Classes filhas dentro do array

        // Adicionando na ArrayList
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(serie1);
        listaDeFilmes.add(serie2);


        // Exibindo a minha lista de filmes
        for (Titulo item : listaDeFilmes) {
            System.out.println("Nome: " + item.getNome() + " - Lancaçmento: " + item.getAnoDeLancamento());
            // Verifcar se o item é um filme ou uma seria
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Clasificação: " + filme.getClassificacao());
            }

        }

        //listaDeFilmes.forEach(System.out::println);

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Z - Bruno Sorriso Maroto");
        buscarPorArtistas.add("Y - Luan Santana");
        buscarPorArtistas.add("A - Pedro Sampaio");
        buscarPorArtistas.add("Kelvin o Cris");
        buscarPorArtistas.add("Fernandinho");


        Collections.sort(buscarPorArtistas);
        System.out.println("Depois da ordenação a lista ficou em: " + buscarPorArtistas);

        // Ordenando nossos filmes
        System.out.println("Lista de filme ordenados:");
        Collections.sort(listaDeFilmes);
        System.out.println(listaDeFilmes);





    }
}
