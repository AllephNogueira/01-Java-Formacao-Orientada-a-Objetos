//Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuario:");
        String usuario = leitura.nextLine();


        http solicitar = new http();



        Gson gson = new Gson();


        try{
            DetalheSolicitacao meuRecord = gson.fromJson(solicitar.SolicitacaoHttps(usuario),DetalheSolicitacao.class);
            Usuario usuario1 = new Usuario(meuRecord);
            System.out.println("Usuario encontrado: " + usuario1);
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMensagem());
        }catch (ErroUsuarioNaoLocalizado e) {
            System.out.println(e.getMensagem());
        }

    }
}