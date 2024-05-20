import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // Aqui gerava de 0 a 3
        // Adicionamos o +1 para gerar de 1 a 3
        int numeroAleatorio = new Random().nextInt(5) +1; // gerando um numero aleatorio ate 100
        Scanner leitura = new Scanner(System.in); // Fazendo a leitura de dados



        int tentativas = 0;

        while (tentativas < 5){
            tentativas++;
            System.out.println("Digite um numero entre 0 e 5: ");
            int numeroEscolhido = leitura.nextInt();

            // Se o jogador ganhar ele entra aqui!
            if (numeroAleatorio == numeroEscolhido){
                String opcao = tentativas > 1 ? "Parabéns você acertou com o total de " + tentativas + " tentativas" : "Nossa!! Você acertou de primeira!";
                System.out.println(opcao);
                break; // Se o jogador ganhar encerramos o while com o break
            }

            // Verificando se o numero é menor ou maior para avisar ao usuario.
            if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O numero digitado é menor que o numero da sorte!");
            }else {
                System.out.println("O numero digitado é maior que o numero da sorte!");
            }


            if(tentativas == 5) {
                System.out.println("Infelizmente acabou suas chances.");
                System.out.println("Você teve o total de 5 tentativas.");
            }

        }


    }
}
