import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do Filme que você quer localizar:");
        var nomeDoFilme = leitura.nextLine().replace(" ", "+");

        // concatenar a informacao

        String minhaChave = "6e3143f0";
        var informacao = "https://www.omdbapi.com/?t=" + nomeDoFilme + "&apikey=" + minhaChave;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(informacao))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body(); // Meu json com as informações.

        //System.out.println("Dados do filme" + json); // Aqui contem a informação geral sobre o filme

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); // Minha implementação para iniciar a GSON

        Dados dados = gson.fromJson(json, Dados.class);


        Filme filme = new Filme(dados);

        System.out.println(filme);



    }
}