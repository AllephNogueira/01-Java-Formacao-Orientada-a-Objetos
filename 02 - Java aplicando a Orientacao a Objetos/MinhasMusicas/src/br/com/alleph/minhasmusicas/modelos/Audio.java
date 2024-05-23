package br.com.alleph.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCuridas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCuridas() {
        return totalCuridas;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public void curte(){
        this.totalCuridas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }
}
