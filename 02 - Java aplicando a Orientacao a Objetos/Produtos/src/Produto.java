public class Produto {
    private String nome;
    private int preco;


    // Set para modifcar produtos


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    // Get para leitura de produtos


    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int descontoProduto(int valor) {
        this.preco = (this.preco - valor);
        return getPreco();
    }
}
