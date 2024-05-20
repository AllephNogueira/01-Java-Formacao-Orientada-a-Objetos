public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Senhor dos Aneis";
        meuFilme.anoDeLancamento = 2000;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.totalDeAvaliacoes = 0;


        meuFilme.exibiFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        meuFilme.avalia(4);
        System.out.println("Total de avaliadores: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Media dos avaliadores: " + meuFilme.calculaMedia());

        System.out.println("Esse filme tem " + meuFilme.idadeFilme() + " anos");


        System.out.println("_____________________");
        System.out.println("_____________________");


        // Criando o segundo objeto e passando seus atributos
        Filme filme2 = new Filme();
        filme2.nome = "Harry Potter";
        filme2.anoDeLancamento = 2016;
        filme2.duracaoEmMinutos = 110;
        filme2.totalDeAvaliacoes = 0;

        filme2.exibiFichaTecnica();
        filme2.avalia(8);
        filme2.avalia(4);
        filme2.avalia(10);

        System.out.println("2 Total de avaliadores: " + filme2.totalDeAvaliacoes);
        System.out.println("2 Media dos avaliadores: " + filme2.calculaMedia());

        System.out.println("2 Esse filme tem " + filme2.idadeFilme() + " anos");


    }
}
