public class Carrinho {

    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    @Override
    public String toString() {
        return "ID: " + this.idProduto + ", Nome: " + this.nomeProduto + ", Descricao: " + this.descricaoProduto;
    }
}
