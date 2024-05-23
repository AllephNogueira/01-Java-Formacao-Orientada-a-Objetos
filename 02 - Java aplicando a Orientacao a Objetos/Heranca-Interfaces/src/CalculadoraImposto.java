public class CalculadoraImposto extends Produto implements Tributavel{

    private double totalImposto = 0.2;


    public double getTotalImposto() {
        return totalImposto;
    }

    public void setTotalImposto(double totalImposto) {
        this.totalImposto = totalImposto;
    }

    public void calculaImposto(Tributavel tributavel) {
        totalImposto += tributavel.calculaImposto();
    }

    public double calculaImposto() {
        return getPreco() * this.totalImposto;
    }

}