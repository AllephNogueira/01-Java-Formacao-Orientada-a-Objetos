public class Principal {
    public static void main(String[] args) {
        Veiculos meuVeiculo = new Veiculos();

        meuVeiculo.mensagem = "...::: Informacoes :::...";
        meuVeiculo.nome = "C4 Lounge";
        meuVeiculo.ano = 2016;
        meuVeiculo.cor = "Prata";
        meuVeiculo.km = 196.000;
        meuVeiculo.velocidadeMaxima = 230;
        meuVeiculo.valorDeMercado = 52.900;

        meuVeiculo.exibirDados();
    }
}
