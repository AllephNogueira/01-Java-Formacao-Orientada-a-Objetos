public class Livro implements Calculavel{

    private String titulo;
    private int preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.10;
    }
}
