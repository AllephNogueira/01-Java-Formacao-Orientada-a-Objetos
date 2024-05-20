import java.util.Scanner;

public class Leitura {

    static String nomeUsuario = "Alleph";

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Qual nome do seu filme favorito?");
        String filme = leitura.nextLine();


        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = leitura.nextInt();
        leitura.nextLine(); // Sempre depois de uma entrada de dados colocamos mais 1, para evitar o erro.


        System.out.println("Digite a nota de 1 a 5");
        int classificacao = leitura.nextInt();
        leitura.nextLine();


        System.out.println("Voce quer comentar sobre o filme? digite: N para não S para sim ");
        String comentario = leitura.nextLine();
        System.out.println(comentario);
        if (comentario.equalsIgnoreCase("s")){ // Aqui vamos ignorar se a entrada de dados for maiuscula ou minuscula
            System.out.println("Digite seu comentario!");
            comentario = leitura.nextLine();

            System.out.println("Digite o seu nome: ");
            nomeUsuario = leitura.nextLine();

        }else {
            System.out.println("Nenhuma opcao escolhida.");
        }






        System.out.println("Nome do filme: " + filme);
        System.out.println("Lançamento: " + anoLancamento);
        System.out.println("Classificação: " + classificacao);
        System.out.println(nomeUsuario + " deixou o comentario: " + comentario);
    }
}
