public class ProdutoPerecivel extends Produto{

    private double dataValidade;

    public ProdutoPerecivel(String nome, int preco, int quantidade, double dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public double getDataValidade() {
        return dataValidade;
    }
}
