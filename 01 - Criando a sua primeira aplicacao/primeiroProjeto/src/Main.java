public class Main {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");


        int anoDeLancamento = 2022;
        System.out.println("Ano de nascimento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;   // Dizer se o usuario pode ou nao acessar ao filme
        if (incluindoNoPlano == false) {
            System.out.println("Filme não esta disponivel no seu plano!");
            return;
        }
        double notaDoFilme1 = 4.0;
        double notaDoFilme2 = 8.1;

        double mediaFilme = notaDoFilme1 + notaDoFilme2;
        int classificacao = (int) (mediaFilme/2);
        System.out.println("Media: " + classificacao);

        String sinopse;
        sinopse = """
                  Filme de aventura dos anos 80
                  Conta a historia de um piloto de avião
                  Lançamento em:""";
        System.out.println(sinopse + " " + anoDeLancamento);



    }
}

