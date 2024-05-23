public class ConversorMoeda implements ConversaoFinanceira{

    private double quantidade;

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public double converterDolaParaReal() {
        return getQuantidade() / 5.15;
    }

    public void conversao(){
        System.out.println(String.format("Convertemos o valor de %.2f $ para o total de %.2f R$", getQuantidade(), converterDolaParaReal()));
    }
}
