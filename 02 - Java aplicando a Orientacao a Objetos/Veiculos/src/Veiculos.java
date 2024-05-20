public class Veiculos {
    String mensagem;
    String nome;
    String cor;
    int ano;
    double km;
    int velocidadeMaxima;
    double valorDeMercado;

    void exibirDados(){
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("ano: " + ano);
        System.out.println("Km: " + km);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("Valor de Mercado: " + valorDeMercado);
    }
}
