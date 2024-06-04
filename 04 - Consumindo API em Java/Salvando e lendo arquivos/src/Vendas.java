
import java.io.IOException;

public class Vendas {
    private int id;
    private String nomeProduto;
    private int quantidadeDeItensVendidos;
    private double valorProduto;
    private String nomeVendedor;

    public Vendas(int id, String nomeProduto, int quantidadeDeItensVendidos, String nomeVendedor)  {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidadeDeItensVendidos = quantidadeDeItensVendidos;
        this.valorProduto = valorProduto;
        this.nomeVendedor = nomeVendedor;


    }


    @Override
    public String toString() {
        return "Vendas{" +
                "id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidadeDeItensVendidos=" + quantidadeDeItensVendidos +
                ", valorProduto=" + valorProduto +
                ", nomeVendedor='" + nomeVendedor + '\'' +
                '}' + "\n";
    }
}
