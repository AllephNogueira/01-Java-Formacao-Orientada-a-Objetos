public class Servico extends Item implements Tributavel {

    private int quantidadeHoras;

    @Override
    public double calculaImposto() {
        return getPreco() * 0.1;
    }

    // outros métodos da classe Servico

}