import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalAvaliacoes = 0;




        while (nota != -1){
            System.out.println("Digite a nota de 1 a 5 ou digite -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) { // Fizemos isso porque quando colocavamos -1 ele contava tambem.
                mediaAvaliacao += nota;
                totalAvaliacoes ++; // Conta a quantidade de avaliações que foram recebidas para fazer a media.
            }
        }


        // Verificando se o usuario avaliou nosso filme.
        if (mediaAvaliacao >= 0){
            String mediaTotal = String.format("%.1f", mediaAvaliacao/totalAvaliacoes); // formatando para exibir apenas 1 casa depois da virgula.
            System.out.println("Availiação media: " + mediaTotal);
            System.out.println("Voce avaliou nosso filme " + totalAvaliacoes + "x");
        }else {
            System.out.println("Sua avaliação é muito importante, mas entendemos que esse não é o momento");
            System.out.println("De qualquer forma, muito obrigado e volte sempre!");
        }

    }
}
