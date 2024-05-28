//Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 38, 2);
        Produto produto2 = new Produto("Feijao", 8, 5);
        Produto produto3 = new Produto("Frango", 12, 20);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Quantidade de produtos adicionado a lista: " + listaProdutos.size());
        System.out.println("O primeiro produto adiciondo a lista foi: " + listaProdutos.get(0).getNome());
        System.out.println("Quantidade de itens: " + Produto.quantidadeTotalDeProdutos(listaProdutos));


        //Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().

        System.out.println("Minha lista de produtos tem os produtos\n" + listaProdutos);

        ProdutoPerecivel produto4 = new ProdutoPerecivel("Macarrao", 5, 10, 01.2025);
        ProdutoPerecivel produto5 = new ProdutoPerecivel("Farinha", 2, 4, 01.2025);


        // Criando a lista de produtos perecivel
        ArrayList<ProdutoPerecivel> listaProdutoPerecivel = new ArrayList<>();

        // Adicionando  a lista
        listaProdutoPerecivel.add(produto4);
        listaProdutoPerecivel.add(produto5);

        // Exibindo minha lista

        System.out.println("Meus produtos pereciveis:");
        for(ProdutoPerecivel produto: listaProdutoPerecivel) {
            System.out.println("Nome: "+ produto.getNome() + " Preco: " + produto.getPreco() + " Quantidade: "+ produto.getQuantidade() + " Validade: "+ produto.getDataValidade() + "\n");

        }

    }
}