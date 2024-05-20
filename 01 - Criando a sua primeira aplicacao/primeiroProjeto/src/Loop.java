import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota de 1 a 5" + " Avaliador: " + (i+1));
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }

        String mediaTotal = String.format("%.1f", mediaAvaliacao/3); // formatando para exibir apenas 1 casa depois da virgula.
        System.out.println("Availiação media: " + mediaTotal);


    }
}
