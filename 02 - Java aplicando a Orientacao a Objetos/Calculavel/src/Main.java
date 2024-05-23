//Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e Caderno, cada uma retornando o preço final considerando descontos ou taxas adicionais.


// Caderno tem 10% de desconto e livro 20%


public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("O senhor dos aneis");
        livro.setPreco(50);

        System.out.println("O " + livro.getTitulo() + " tem o valor de: " + livro.getPreco() + "R$ com desconto de 10% = -" + livro.calcularPrecoFinal());

        Caderno caderno = new Caderno();
        caderno.setTitulo("Harry potter");
        caderno.setPreco(50);

        System.out.println("O " + caderno.getTitulo() + " tem o desconto de " + caderno.calcularPrecoFinal());
    }
}