public class Produto implements Vendavel{

    private String nome;
    private int preco;
    private int quantidade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal() {
        return this.quantidade * this.preco;
    }


    @Override
    public void aplicarDesconto(double percentualDesconto) {
        double descontoProduto = calcularPrecoTotal() * percentualDesconto;
        double precoTotal = calcularPrecoTotal() - descontoProduto;
        System.out.println("Para pagamento em dinheiro, voce tem desconto de: " + descontoProduto + "\nFicando o total de: " + precoTotal);

    }

    void informacao (){
        System.out.println("Produto: " + getNome() +
                           "\nPreco: " +getPreco() +
                           "\nQuantidade: " +getQuantidade() +
                           "\nPreco final: " +calcularPrecoTotal());
    }
}
