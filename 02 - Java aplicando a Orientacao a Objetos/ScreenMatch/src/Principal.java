import br.com.alleph.screenmatch.modelos.Filme;
import br.com.alleph.screenmatch.modelos.Serie;
import br.com.alleph.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.alleph.screenmatch.modelos.calculos.FiltroRecomendacao;
import br.com.alleph.screenmatch.modelos.modelos.Episodio;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9); favorito.avalia(8); favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia() + "\n\n\n");


        Serie Vikings = new Serie();
        Vikings.setNome("Vikingss");
        Vikings.setAnoDeLancamento(1999);

        Vikings.setTemporadas(6);
        Vikings.setEpisodiosPorTemporada(12);
        Vikings.setMinutosPorEpisodio(60);
        Vikings.setIncluidoNoPlano(true);


        Vikings.exibeFichaTecnica();
        Vikings.exibeFichaSerie();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(Vikings);
        System.out.println("Tempo total da Serie: " + calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Vikings);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }

}
