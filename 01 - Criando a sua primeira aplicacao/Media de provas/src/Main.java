public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double nota1 = 8.5;
        double nota2 = 9.6;
        double nota3 = 5.4;
        double nota4 = 4.8;

        double notaTotal = nota1 + nota2 + nota3 + nota4;
        double mediaGeral = notaTotal /4;
        String mediaFormatada = String.format("%.1f", mediaGeral);

        if (mediaGeral > 6) {
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Você precisa estudar um pouco mais!");
            System.out.println("Você foi reprovado seu resultado final foi " + mediaFormatada);
            return;
        }


        System.out.println("Parabens você foi aprovado, e agora, qual caminho quer seguir?");
        System.out.println("Sua media geral foi " + (int)(mediaGeral)); // transformando o valor double em inteiro
    }
}