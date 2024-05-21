import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto1 = new Produto();

        produto1.setNome("Arroz");
        produto1.setPreco(38);


        System.out.println("Seu pagamento é em dinheiro?     S / N");
        String pagamento = scanner.nextLine();
        if (pagamento.equalsIgnoreCase("S")) {
            produto1.descontoProduto(5);
        }

        System.out.println(produto1.getNome() + " R$ " + produto1.getPreco());
    }
}