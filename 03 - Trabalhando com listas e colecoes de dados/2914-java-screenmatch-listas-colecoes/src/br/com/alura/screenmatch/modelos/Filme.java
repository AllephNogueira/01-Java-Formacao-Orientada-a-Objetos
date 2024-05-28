package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {

        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        //return super.toString(); Isso aqui significa, SUPER toString = devolva por padrao oque ja tem na classe mae
        // Antes ele pegava nome da classe + @ + um codigo hexadecimal
        // Agora ele pega essa informação que eu escolhi
    }
}
