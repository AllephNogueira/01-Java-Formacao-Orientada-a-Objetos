import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var produto01 = new Carrinho();

        // Criando os objetos
        produto01.setIdProduto(0);
        produto01.setNomeProduto("Arroz");
        produto01.setDescricaoProduto("Tio João");

        var produto02 = new Carrinho();
        produto02.setIdProduto(1);
        produto02.setNomeProduto("Feijao");
        produto02.setDescricaoProduto("Carreteiro");

        // Criando a lista
        ArrayList<Carrinho> listaCarrinho = new ArrayList<>();

        // Adicionando produtos a lista
        listaCarrinho.add(produto01);
        listaCarrinho.add(produto02);

        // Exibindo produtos com toString
        System.out.println(listaCarrinho);

        // Exibindo apenas 1 produto

        System.out.println("\nO Produto com id 0 é: " + listaCarrinho.get(0).getNomeProduto());

        // Exibindo produtos sem o ToString

        System.out.println("\n Produtos sem o toString ");
        for (Carrinho produto : listaCarrinho) {
            System.out.println(produto);
        }


        // Contando a quantidade de produtos na lista

        System.out.println("Meu carrinho: " + listaCarrinho.size() + " " + (listaCarrinho.size() < 2 ? "produto":"produtos"));




    }
}