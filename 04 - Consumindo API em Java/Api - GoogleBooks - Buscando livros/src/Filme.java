public class Filme {
    private String titulo;
    private String anoLancamento;

    public Filme(Dados dados) {
        this.titulo = dados.title();
        this.anoLancamento = dados.year();
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Lançamento: " + anoLancamento;
    }
}
