import java.util.ArrayList;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para calcular a quantidade total de produtos na lista
    public static int quantidadeTotalDeProdutos(ArrayList<Produto> listaProdutos) {
        int total = 0;
        for (Produto produto : listaProdutos) {
            total += produto.getQuantidade();
        }
        return total;}


    public String toString() {
        return "Nome: " + getNome() + "\n Preco: " + getPreco() + "\n Quantidade: " + getQuantidade() + "\n\n";
    }
}
