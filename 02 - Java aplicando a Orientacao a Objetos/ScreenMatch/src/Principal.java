import br.com.alleph.screenmatch.modelos.Filme;
import br.com.alleph.screenmatch.modelos.Serie;
import br.com.alleph.screenmatch.modelos.calculos.CalculadoraDeTempo;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia() + "\n\n\n");


        Serie Vikings = new Serie();
        Vikings.setNome("Vikings");
        Vikings.setAnoDeLancamento(1999);

        Vikings.setTemporadas(6);
        Vikings.setEpisodiosPorTemporada(12);
        Vikings.setMinutosPorEpisodio(60);
        //System.out.println("Duracao da minha serie: " + Vikings.getDuracaoEmMinutos());


        Vikings.setIncluidoNoPlano(true);


        Vikings.exibeFichaTecnica();
        Vikings.exibeFichaSerie();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(Vikings);
        System.out.println("Tempo total da Serie: " + calculadora.getTempoTotal());



        CalculadoraDeTempo calculadoraFilme = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        System.out.println("Tempo total do filme: " + calculadoraFilme.getTempoTotal());
    }

}
