import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        String vendedor = leitura.nextLine();

        int opcao = 1;
        int contador = 0; // Recuperar ID's futuramente.

        Gson gson = new GsonBuilder() // Aqui estou dizendo que vou criar um novo padrao para ele
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting() // o setPrettyPrinting Deixa o documento mais legivel
                .create(); // No caso aqui estou criando um padrao para ele colocar as letras em maiusculas.

        List<Vendas> vendasList = new ArrayList<>(); // A minha lista
        FileWriter vendeu = new FileWriter("Vendas.json"); // O meu arquivo de vendas.



        while (opcao == 1){
            if (opcao == 1) {
                System.out.println("VOCE ESTA ADICIONANDO UM NOVO PRODUTO!");
                contador++;

                //Adicionando informações sobre o produto.
                if (contador <= 1) {
                    System.out.println("Pressione qualquer tecla para continuar");
                }
                leitura.nextLine();
                System.out.println("Digite o nome do produto:");
                String nomeProduto = leitura.nextLine();
                System.out.println("Digite a quantidade de itens");
                int quantidadeProdutos = leitura.nextInt();



                Vendas novaVenda = new Vendas(contador, nomeProduto, quantidadeProdutos, vendedor);

                // Adicionando os produtos a minha lista.
                vendasList.add(novaVenda);

            }

            System.out.println("VOCÊ VENDEU O TOTAL DE " + contador + " " + (contador <= 1? "PRODUTO" : """
                    PRODUTOS

                    """) );
            System.out.println("....:::: Para sair digite: 0   -   Para continuar digite: 1 :::...");
            opcao = leitura.nextInt();

        }// FIM WHILE

        System.out.println("Produtos vendidos:" + vendasList + "\n");
        //vendeu.write(vendasList.toString()); // Assim iriamos pegar a lista
        vendeu.write(gson.toJson(vendasList) + "\n"); // Pegando minha lista e convertendo para JSON
        vendeu.close();

        System.out.println("Serviço finalizado com sucesso!");
    }
}