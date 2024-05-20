//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.


public class Musica {
    String titulo;
    String artista;
    int anolacamento;
    int somaDasAvaliacoes = 0;
    int numeroDeAvaliadores = 0;


    void informacaoDaBanda(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Lacamento: " + anolacamento);
    }

    void nota(int nota){ // Isso é um metodo apenas para acumular informacao
        somaDasAvaliacoes += nota;
        numeroDeAvaliadores++;
    }

    int calcularMedia(){ // Aqui fazemos a divisao do total de avaliadores pela nota.
        // Também podemos limitar a nota a 5, assim fariamos uma media de 1 a 5
        return somaDasAvaliacoes / numeroDeAvaliadores;
    }

}
