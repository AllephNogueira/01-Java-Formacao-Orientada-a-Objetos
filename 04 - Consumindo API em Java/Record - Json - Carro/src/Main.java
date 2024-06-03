import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        // Aqui é meu objeto json
        String json = "{\"modelo\":\"c4\",\"cor\":\"prata\",\"tipoCombustivel\":\"flex\"}";


        // Aqui é onde estamos passando para um Record o record nada mais que um cara intermediario onde vai recber as informações
        Gson gson = new Gson();
        Carro carro = gson.fromJson(json, Carro.class); // Record, inicializando ele.



        DadosVeiculo veiculo1 = new DadosVeiculo(carro); // Criando um novo objeto e passando os atributos do record como parametro
        // Observação reparar que precisamos criar um construtor
        System.out.println("Veiculo = " + veiculo1);

    }
}