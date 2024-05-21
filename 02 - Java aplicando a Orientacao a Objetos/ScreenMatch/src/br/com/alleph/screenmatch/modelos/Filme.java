public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes; // Privado só pode ser acessado dentro da propria classe / Ou invocar ele dentro de um metodo para usar fora.
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibiFichaTecnica() {   // Esse e meu metodo.
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calculaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    int idadeFilme(){
        return 2024 - anoDeLancamento;
    }
}
