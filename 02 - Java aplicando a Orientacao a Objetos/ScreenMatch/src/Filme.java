public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incuidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

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
