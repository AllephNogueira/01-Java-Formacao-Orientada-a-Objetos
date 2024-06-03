import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonparaIObjeto {

    public static void main(String[] args) {

        // meu json
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\", \"Profissao\":\"Programador\"}";


        System.out.println(jsonPessoa); // Meu json


        Gson gson = new GsonBuilder().setLenient().create(); // Em seguida, implemente um programa que utiliza a biblioteca Gson


        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        FichaCadastral cadastro1 = new FichaCadastral(pessoa);
        System.out.println("Usuario" +cadastro1);

    }
}
