import br.com.alleph.verificar.GerarProximo;


//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.


public class Main {
    public static void main(String[] args) {

        GerarProximo numero = new GerarProximo();



        numero.Verificar(230);
        System.out.println("Voce digitou o numero: " + numero.getNumero());
        System.out.println(numero.getVerificacao());


        System.out.println(numero.getNumero() %2==0? "Proximo numero par: " + numero.GerarProximoPrimo() : "Proximo numero impar: " + numero.GerarProximoPar());


    }
}