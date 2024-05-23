public class Caderno extends Livro implements Calculavel{

    // Livro tem 20% de desconto

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.20;
    }
}
