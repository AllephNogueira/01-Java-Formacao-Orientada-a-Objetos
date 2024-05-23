//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.



public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setQuantidade(10); // Quantidade de dolar que voce tem.

        conversor.conversao();

    }
}