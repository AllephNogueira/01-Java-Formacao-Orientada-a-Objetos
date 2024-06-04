import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o cep que você quer localizar:");
        String cep = leitura.nextLine();
        leitura.close();
        String informacaoCompleta = "https://viacep.com.br/ws/" + cep.replace("-", "") + "/json/";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(informacaoCompleta))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String dadosEncontrados = response.body();

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // To criando um novo biuld e colocando os texto mais bonitinho.
        CepRecord meuRecord = gson.fromJson(dadosEncontrados, CepRecord.class); // Pegando os dados que eu quero.

        Cep dadosLocalizados = new Cep(meuRecord); // Passando os dados para minha classe principal e acertando o texto com toString

        System.out.println(dadosLocalizados);

        // Agora vamos passar esses dados para um arquivo JSON

        FileWriter meuArquivo = new FileWriter("meuArquivo.json"); // Criando meu arquivo
        meuArquivo.write(gson.toJson(dadosLocalizados)); // Convertendo de volta para o JSON
        meuArquivo.close(); // Fechando.
    }
}