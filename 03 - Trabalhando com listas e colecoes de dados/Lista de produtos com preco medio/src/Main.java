import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Arroz", 30);
        Produtos produto2 = new Produtos("Feijao", 8);
        Produtos produto3 = new Produtos("Macarrao", 5);
        Produtos produto4 = new Produtos("Frango", 13);

        //Criando minha lista de produtos
        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        // Adicionando produtos a minha lista
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        // Exibindo os produtos da minha lista


        System.out.println("Produtos adicionados a minha lista ");
        double precoTotal = 0;
        for(Produtos produtos : listaProdutos){
            System.out.println(produtos.getNome());
            precoTotal += produtos.getPreco();
        }

        System.out.println("Preco total da minha lista: " + precoTotal + "R$");
        System.out.println("Preco medio da minha lista: " +  precoTotal / listaProdutos.size() + "R$");






    }


}