public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluindoNoPlano = true;   // Dizer se o usuario pode ou nao acessar ao filme
        double notaDoFilme1 = 4.0;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancaçamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir!");
        }

        if (incluindoNoPlano && tipoPlano.equals("plus")) { // Se for true ele entra se for falso ele nao entra
            System.out.println("Filme liberado");
        }else {
            System.out.println("Cliente deve pagar a locação!");
        }

    }
}
