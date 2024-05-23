package br.com.alleph.minhasmusicas.Principal;

import br.com.alleph.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alleph.minhasmusicas.modelos.Musica;
import br.com.alleph.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Conquistando o impossivel");
        minhaMusica.setCantor("Luan Santana");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        /////////////////////////////////////////////////////////////////////////////////

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Gustavo Guanabara");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);



    }
}