package br.com.alleph.screenmatch.modelos.calculos;

import br.com.alleph.screenmatch.modelos.Filme;
import br.com.alleph.screenmatch.modelos.Serie;
import br.com.alleph.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//
//    }
}
