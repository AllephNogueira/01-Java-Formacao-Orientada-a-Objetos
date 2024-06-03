import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class http {

    public String SolicitacaoHttps(String usuario) throws IOException, InterruptedException {

        if(usuario.contains(" ")){
            throw new ErroConsultaGitHubException("Erro: o nome de usuário contém um espaço.\nForma como você escreveu: " + usuario + " Forma como deveria ser escrito: " + usuario.replace(" " , "") + "\nDigite novamente da forma correta.");
        }

        String informacaoTotal = "https://api.github.com/users/" + usuario;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(informacaoTotal))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body(); // Minha variavel com as informações

        return json;
    }
}
