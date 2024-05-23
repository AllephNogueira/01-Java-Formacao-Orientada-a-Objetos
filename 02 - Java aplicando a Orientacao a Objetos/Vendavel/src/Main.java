//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Samsung s24");
        produto1.setPreco(3900);
        produto1.setQuantidade(2);

        produto1.informacao();
        produto1.aplicarDesconto(0.20);

    }
}