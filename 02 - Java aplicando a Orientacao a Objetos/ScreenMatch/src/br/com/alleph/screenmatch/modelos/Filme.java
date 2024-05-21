package br.com.alleph.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes; // Privado só pode ser acessado dentro da propria classe / Ou invocar ele dentro de um metodo para usar fora.
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibiFichaTecnica() {   // Esse e meu metodo.
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double calculaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int idadeFilme(){
        return 2024 - anoDeLancamento;
    }
}
